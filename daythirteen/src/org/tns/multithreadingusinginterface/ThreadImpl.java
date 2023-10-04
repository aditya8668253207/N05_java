package org.tns.multithreadingusinginterface;

// runnable is a functional interface delcared in lang package of java
public class ThreadImpl implements Runnable {

	// run() is abstract method of runnable interface 
	@Override
	public void run() {
		
		for(int i=1; i<=50; i++) {
			System.out.println(Thread.currentThread()+":"+i);
		}
		
		
		
	}
	// this is not a actual thread so we cant start it because it does not extends thread class

}
