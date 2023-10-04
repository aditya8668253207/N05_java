package org.tns.multithreeding;

public class Executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main..."+Thread.currentThread());
		ChildThread t1 = new ChildThread();
		t1.run();
		t1.run();
		
		// when we call run method explicitly the code becomes single threaded i.e main thread
		// to achinve multithreading we have to use start method to start the thread

	}

}
