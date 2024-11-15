package com.spring.mms.exception;

public class MovieNotFoundByIdException extends Exception {

	private final String message;
	private final String redirectTo;
	public MovieNotFoundByIdException(String message, String redirectTo) {
		super();
		this.message = message;
		this.redirectTo = redirectTo;
	}
	public String getMessage() {
		return message;
	}
	public String getRedirectTo() {
		return redirectTo;
	}
}
