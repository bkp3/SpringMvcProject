package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		
		
		return "contact";
	}
	
	/*
	// old fashion, long code
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail,
			@RequestParam("name") String userName,
			@RequestParam("password") String userPassword, Model model ) {
		
		
		
		User user = new User();
		user.setEmail(userEmail);
		user.setName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		
		// process the data like :- modify data, send to db, check data etc
		
		
		
		  //model.addAttribute("email",userEmail); 
		  //model.addAttribute("name",userName);
		  //model.addAttribute("password",userPassword);
		 
		
		model.addAttribute("user",user);
		
		return "success";
	}
	
	*/
	

	//new fashion less code
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		
		if(user.getName().isBlank()) {
			return "redirect:/contact";
		}
		
		
		int createdUser = this.userService.createUser(user);
		
		// process the data like :- modify data, send to db, check data etc
		
		model.addAttribute("msg", "user created successful with :- "+createdUser);
		return "success";
	}


}
