package com.bridgelabz.userregistrationtest;

public class UserValidationException extends RuntimeException{

	ExceptionType type;
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}
	public UserValidationException(ExceptionType type, String message) {
		super(message);
		this.type=type;
	}
}