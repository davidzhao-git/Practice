package practice.data.structures;

import java.util.LinkedList; 
import java.util.Queue; 

public class SampleQueue {

	public static void main(String[] args) {
		
		// error: Queue<Integer> q = new Queue<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			q.add(i);
		}
		System.out.println(q);
		
		// int removeFrontElement = q.remove();
		// System.out.println("Removed Front Element is " + removeFrontElement);
		// System.out.println(q);
		
		int viewFrontElement = q.peek();
		System.out.println("To view Front Element " + viewFrontElement);
	}

}
