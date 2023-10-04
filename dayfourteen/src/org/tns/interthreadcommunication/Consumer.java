package org.tns.interthreadcommunication;

public class Consumer extends Thread {
	Q obj;
	
	public Consumer(Q obj) {
		this.obj = obj;
		start();
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(0);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}

}
