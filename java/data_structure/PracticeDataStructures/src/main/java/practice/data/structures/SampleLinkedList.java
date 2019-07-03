package practice.data.structures;

import java.util.*;

public class SampleLinkedList {
	
	public static void main(String[] args) {
		
		// error: LinkedList<int> num = new LinkedList<int>();
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		// Adding is O(1) time
		num.add(10);
		num.add(20);
		num.add(30);
		num.addFirst(555);	
		num.addLast(666);
		num.add(3, 777);			// add 777 at position 3
		
		System.out.println(num);
		
		num.remove(1);
		System.out.println(num);
		
		// num.removeFirst();
		// System.out.println(num);
		
		// LinkedList<Double> doubleNum = new LinkedList<Double>();
		
		
	}
	
}
