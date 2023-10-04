package org.tns.synchronizedmultithreading;

public class DepositeLimitExceededException extends Exception {

	public DepositeLimitExceededException() {
		super("Deposite limit exceeded....");
	}
	
	public DepositeLimitExceededException(String message) {
		super(message);
	}
	
	

}
