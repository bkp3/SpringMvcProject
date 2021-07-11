package springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	
	//centerlized exception handler
	
	@ExceptionHandler({Exception.class})
	public String exceptionHandlerNull() {
		return "nullpage";
	}

}
