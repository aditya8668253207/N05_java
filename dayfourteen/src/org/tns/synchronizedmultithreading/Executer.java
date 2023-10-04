// Program to demonstrate the synchronization in multithreading
// there are two methods to achieve multithreading in java
	// 1. synchronized method (written in Account class)
	// 2. Synchronized block (written in AccountThread class)
package org.tns.synchronizedmultithreading;

public class Executer {

	public static void main(String[] args)  {
	
		Account acc = new Account(111,"Amit",12000);
		AccountThread threadone = new AccountThread(acc,8000);
		AccountThread threadtwo = new AccountThread(acc,5000);
		threadone.start();
		threadtwo.start();
		System.out.println(acc);
		
		// this piece of code is for without the concept of multithreading
//			try {
//			System.out.println(acc);
//			acc.deposite(7000);
//			System.out.println(acc);
//			acc.withdraw(22000);
//			System.out.println(acc);
//			
//		} catch (DepositeLimitExceededException | InsufficientBalanceException e) {
//			e.printStackTrace();
//		}
		
	}

}

// extra
         //the compiler gives only suggestion for checked exception not for unchecked exception
		// user defined exception is also consider as checked exception
		
