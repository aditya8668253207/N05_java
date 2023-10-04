package org.tns.multithreeding;

public class ThreadDemo {

	static void printHello() {
		System.out.println("Print Hello : "+Thread.currentThread());
		for(int i=0;  i<5;i++) {
			System.out.println("Hello");
		}
	}
	
	static void prindOdd() {
		for(int i=0; i<5; i++) {
			System.out.println("Print odd..."+Thread.currentThread());
		}
	}
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		ChildThread t1 = new ChildThread();
		t1.start();
		ChildThread t2 = new ChildThread();
		t2.start();
		ChildThread t3 = new ChildThread();
		t3.start();
	}

}
