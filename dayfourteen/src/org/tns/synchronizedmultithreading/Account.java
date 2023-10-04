// There are two way's to achieve synchronization in multithreading
		// 1. synchronized method
		// 2. Synchornized block ( written in AccountThread class )
package org.tns.synchronizedmultithreading;

public class Account implements Bank {
	
	private int accNo;
	private String name;
	private int balance;
	
	
	// constructor
	// default constructor
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// parameterized construcotr
	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
		
		// methods
		
		@Override
		// 1. Synchronized method : Synchronized methods are used to synchronize entire methods, meaning that only one 
		// thread can execute the synchronized method for a given object or class at a time.
		public synchronized void deposite(int amount) throws DepositeLimitExceededException {
			if (amount > Bank.DEPOSIT_LIMIT) {
				throw new DepositeLimitExceededException("Can't deposite that much money");
			}
			balance+=amount;
		}

		@Override
		// this method is synchronized using synchronized block which is present in AccountThread class.
		public void withdraw(int amount) throws InsufficientBalanceException {
			if (amount > balance-MIN_BALANCE) {
				throw new InsufficientBalanceException("Insufficient Balance...Can't withdraw");
			}
			balance-=amount;
		}


	// getter setter methods
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// toString method
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
