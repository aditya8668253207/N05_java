package org.tns.synchronizedmultithreading;

public class AccountThread extends Thread{

	Account acc;
	int amount;
	public AccountThread() {
		
	}
	
	public AccountThread(Account acc, int amount) {
		this.acc=acc;
		this.amount=amount;
	}
	
	// 2nd method of synchronization ... synchronized block
	// The block is synchronized on the acc object, which means that only one thread can execute this block of code 
	//at a time for the given acc object. Other threads attempting to enter the synchronized block 
	// will be blocked until the current thread exits the block
	public void run() {
		try {
			synchronized (acc) {
				acc.withdraw(amount);
			}	
		}
		catch(InsufficientBalanceException e){
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}
}
