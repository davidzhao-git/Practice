package multithreads.samples;

public class SamplePriority {

	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		MyThread3 t3 = new MyThread3();
		
		// Default = 5 for all the threads 
		// System.out.println("t1 thread priority : " + t1.getPriority()); 
		// System.out.println("t2 thread priority : " + t2.getPriority());
		// System.out.println("t3 thread priority : " + t3.getPriority()); 
		
		t1.setPriority(9); 
        t2.setPriority(10); 
        t3.setPriority(2); 

        t1.run();
        t2.run();
        t3.run();
	}
}

	
class MyThread1 extends Thread {
		
	public void run() {
		System.out.println("Inside run method T1"); 
	}
}
class MyThread2 extends Thread {
	
	public void run() {
		System.out.println("Inside run method T2"); 
	}
}
class MyThread3 extends Thread {
	
	public void run() {
		System.out.println("Inside run method T3"); 
	}
}
	
	
