package com.nagarro.accountmanagement.exceptions;

public class NoAccountFoundException extends RuntimeException {
	public NoAccountFoundException() {
        super("Account Not Found");
    }

    public NoAccountFoundException(String message) {
        super(message);
    }


}
