package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	
	// redirect prefix
	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/enjoy";
	}
	
	//redirectview
	@RequestMapping("/zero")
	public RedirectView zero() {
		System.out.println("This is zero handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is second heandler[enjoy]");
		return "";
	}

}
