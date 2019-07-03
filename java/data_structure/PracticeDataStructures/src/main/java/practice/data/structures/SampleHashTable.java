package practice.data.structures;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class SampleHashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashT1 = new Hashtable<Integer, String>();
		hashT1.put(10, "USD");
		hashT1.put(5, "EUR");
		hashT1.put(15, "CNY");
		System.out.println(hashT1);
		
		Map<String, Double> hashT2 = new Hashtable<String, Double>();
		hashT2.put("Pen", 2.5);
		hashT2.put("Pencil", 1.0);
		hashT2.put("Pencil Box", 1.5);
		hashT2.put("Backpack", 20.0);
		System.out.println(hashT2);
		// System.out.println(hashT2.toString());
		
		// add the key/value pair if the value does not exist in the map yet
		hashT2.computeIfAbsent("Black Pen", k -> 2.7);
		hashT2.computeIfAbsent("Pen", k -> 3.7);
		System.out.println("After adding the new key/value ");
		System.out.println(hashT2.toString() + '\n');
		
		// contains()
		if (hashT1.contains("EUR")) {
			System.out.println("Found EUR");
		} else {
			System.out.println("EUR Not Found");
		}
		
		// containsKey
		if (hashT2.containsKey("pencil Box")) {
			System.out.println("Found the key");
		} else {
			System.out.println("Key Not Found");
		}
		
		// containsValue
		if (hashT2.containsValue(10.0)) {
			System.out.println("Found the value 10.0");
		} else {
			System.out.println("Not Found the value 10.0");
		}
		
		// Enumeration elements() 
		System.out.println("print out e1.nextElement() ");
		Enumeration e1 = hashT1.elements();
		while (e1.hasMoreElements()) {
			System.out.print(e1.nextElement() + " ");
		}
		System.out.println();
		
		System.out.println("print out e2.nextElement() ");
		Enumeration e2 = ((Dictionary<Integer, String>) hashT2).elements();
		while (e2.hasMoreElements()) {
			System.out.print(e2.nextElement() + "  ");
		}
	}

}
