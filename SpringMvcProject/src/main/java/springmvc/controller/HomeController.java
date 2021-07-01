package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("This is home url");
		
		model.addAttribute("name", "Rajesh Kumar");
		model.addAttribute("price",1234);
		
		ArrayList<String>city=new ArrayList<String>();
		city.add("Patna");
		city.add("Kolkata");
		city.add("Delhi");
		city.add("Mumbai");
		
		model.addAttribute("c",city);
		
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

}
