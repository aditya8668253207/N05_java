package org.tns.synchronizedmultithreading;

public interface Bank {

	final static int DEPOSIT_LIMIT = 25000;
	static final int MIN_BALANCE = 1000;
	
	// abstract methods
	public abstract void deposite(int amount) throws DepositeLimitExceededException;
	public abstract void withdraw(int ammount) throws InsufficientBalanceException;
	
	
}
