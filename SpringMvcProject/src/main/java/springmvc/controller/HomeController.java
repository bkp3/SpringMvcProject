package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.*;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("This is home url");

		model.addAttribute("name", "Rajesh Kumar");
		model.addAttribute("price", 1234);

		ArrayList<String> city = new ArrayList<String>();
		city.add("Patna");
		city.add("Kolkata");
		city.add("Delhi");
		city.add("Mumbai");

		model.addAttribute("c", city);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {

		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name", "Rakesh Kumar");
		modelAndView.addObject("rollnumber",1234);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer>list = new ArrayList<Integer>();
		list.add(1234);
		list.add(2342);
		list.add(9487);
		list.add(5884);
		list.add(2312);
		list.add(1234567890);
		
		modelAndView.addObject("number", list);
		
		//setting the view name
		modelAndView.setViewName("help");
		
		return modelAndView;
	}

}
