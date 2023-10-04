package org.tns.multithreadingusinginterface;

public class RunnableDemo {

	public static void main(String[] args) {
		
		// 1st way - creating implementable class and wrapping the object of class with thread class
		ThreadImpl implObj = new ThreadImpl();
		
		// implObj.start();
		// this is not a actual thread so we cant start using start() method
		//it because it does not extends thread class
		
		// wrapping the implObj with thread class object to create a thread
		Thread threadone = new Thread(implObj);
		threadone.start();
		
		
		
		// second way - anonymous class
		Runnable obj = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				char ch = 'a';
				for(int i=1; i<26; i++, ch++) {
					System.out.println(Thread.currentThread()+":"+ch);
				}
				
			}
			
		};
		 Thread thredtwo = new Thread(obj);
		 thredtwo.start();
		
		 
		 
		 
		 
		 // 3rd way - Lambda Expression
		 
		Runnable object = ()->{
			for(int i=1; i<=100; i+=2) {
				System.out.println(Thread.currentThread()+":"+i);
			}
		};
		Thread threadThree = new Thread(object);
		threadThree.start();

	}
	
	// learn about sleep(), join(), and isAlive() methods from youtube and add this in this code

}
