package multithreads.samples;

import java.lang.*;

public class SampleYeild {
	
	public static void main(String[] args) throws InterruptedException {
	
		MyThread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}
}

class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " ...in control");
		}
	}
	
}
