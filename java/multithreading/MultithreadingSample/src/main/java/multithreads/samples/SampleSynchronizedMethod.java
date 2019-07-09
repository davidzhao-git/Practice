package multithreads.samples;

import java.io.*; 
import java.util.*; 


public class SampleSynchronizedMethod {
	
	public static void main(String[] args) {
		
		// Sender sender = new Sender();
		ThreadSender thSender1 = new ThreadSender("Hello there", new Sender());
		ThreadSender thSender2 = new ThreadSender("Good morning", new Sender());
		
		thSender1.run();
		thSender2.run();
	}
	
}

class Sender {
	
	public void send(String message) {
		System.out.println("Sending: " + message);
	
		/*
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
		*/
		
	}
}

class ThreadSender extends Thread { 
	private String message;
	private Thread th;
	Sender sender;
	
	public ThreadSender(String message, Sender sender) {
		this.message = message;
		this.sender = sender;
	}
	
	public void run() {
		synchronized(sender) {
			sender.send(message);
		}
	}
}

