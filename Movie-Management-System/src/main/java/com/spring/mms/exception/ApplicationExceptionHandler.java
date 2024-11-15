package com.spring.mms.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler
	public String handleMovieNotFoundById(MovieNotFoundByIdException ex,Model model) {
		model.addAttribute("errorMessage", ex.getMessage());
		model.addAttribute("redirectTo", ex.getRedirectTo());
		
		return "error.jsp";
	}
}
