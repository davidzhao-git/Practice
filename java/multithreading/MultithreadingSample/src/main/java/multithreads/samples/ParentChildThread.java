package multithreads.samples;

public class ParentChildThread extends Thread {

	public static void main( String[] args ) {
		
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t.getName());
		
		// changing name of Main thread
		t.setName("Parent Thread");
		// System.out.println("Current thread: " + t.getName());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Current thread: " + t.getName());
		}
		
		ChildThread childThread = new ChildThread();
		childThread.run();
	}
}

class ChildThread implements Runnable {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}
}
