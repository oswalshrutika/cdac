package com.grocery.custom_exception;

@SuppressWarnings("serial")
public class UserHandlingException extends RuntimeException {
public UserHandlingException(String mesg) {
	super(mesg);
}
}
