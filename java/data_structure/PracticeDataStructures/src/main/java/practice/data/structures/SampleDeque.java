package practice.data.structures;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class SampleDeque {

	public static void main(String[] args) {
		
		Deque<String> deque = new LinkedList<String>();
		deque.addLast("Element 1 - Hello");
		deque.addLast("Element 2 - Bye");
		deque.push("Element 3 - Good Morning");
		deque.addFirst("Element 4 - Have a nice day");
		System.out.println(deque);
		
		// Iterate through the queue elements
		Iterator<String> iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}
		
		// Reverse order iterator
		Iterator<String> reverse = deque.descendingIterator(); 
		System.out.println("Reverse Iterator"); 
        while (reverse.hasNext()) {
        	System.out.println("\t" + reverse.next());
        }
	}
	
}
