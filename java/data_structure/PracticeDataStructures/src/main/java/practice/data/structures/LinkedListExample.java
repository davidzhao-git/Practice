package DataStructure;

import java.util.LinkedList;

public class LinkedListExample {
	
    public static void main(String[] args) {
    	
    	LinkedList<String> theList = new LinkedList<String>();
    	
    	// insertion
    	theList.add("Hello");
    	theList.add("There");
    	theList.addFirst("OK");
    	theList.addLast("nice");
    	theList.add(1, "Good Morning");
    	
    	System.out.println(theList);
    	
    	// deletion 
    	theList.remove(3);
    	System.out.println(theList);
    
    	// return the element at location 2 
    	System.out.println(theList.get(2));
    	
    }
}
