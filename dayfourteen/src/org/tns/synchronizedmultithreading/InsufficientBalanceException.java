package org.tns.synchronizedmultithreading;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Minimum balance in your account....");
	}
	// parameterized constructor of exception class with string as a parameter
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
