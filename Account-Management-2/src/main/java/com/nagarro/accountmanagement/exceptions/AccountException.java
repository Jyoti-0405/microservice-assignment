package com.nagarro.accountmanagement.exceptions;

public class AccountException extends RuntimeException {
	
	 public AccountException() { super("Account Exception Occured");}

	 public AccountException(String message){super(message); }

}
