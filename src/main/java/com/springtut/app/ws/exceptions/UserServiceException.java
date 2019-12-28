package com.springtut.app.ws.exceptions;

public class UserServiceException extends RuntimeException {
	
	private static final long serialVersionUID = 7296056767697876286L;

	public UserServiceException(String message) {
		super(message);
	}
}
