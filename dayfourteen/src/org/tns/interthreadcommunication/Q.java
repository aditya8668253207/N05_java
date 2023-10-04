package org.tns.interthreadcommunication;
// Service class
public class Q {

	int n;
	boolean valueSet = false;
	
	public synchronized void put(int n) {
		if(valueSet) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		this.n=n;
		valueSet = true;
		System.out.println("Put : "+n);
		notify();
	}
	
	public synchronized void get() {
		if(!valueSet) {
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Getting Data : "+n);
		valueSet = false;
		notify();
	}
}
