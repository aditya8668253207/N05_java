package org.tns.multithreeding;

public class ChildThread extends Thread{

	public void run() {
		System.out.println("THis is task of child thred..."+Thread.currentThread());
		ThreadDemo.printHello();
	}

	
}
