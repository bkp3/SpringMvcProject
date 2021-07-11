package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/khoj")
	public String home() {
		System.out.println("going to home...");
		
		String str=null;
		System.out.println(str.length());
		
		return "khoj";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		if(query.isBlank()) {
			RedirectView redirectView1 = new RedirectView();
			redirectView1.setUrl("khoj");
			return  redirectView1;
		}
		
		String url = "https://www.google.com/search?q="+query;
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return  redirectView;
	}
	
	//Handling exception in mvc
	
	/*
	 * @ExceptionHandler({Exception.class}) public String exceptionHandlerNull() {
	 * return "nullpage"; }
	 */

}
