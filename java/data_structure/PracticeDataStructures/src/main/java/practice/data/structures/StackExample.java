package DataStructure;

import java.util.Stack;

public class StackExample {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(6);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Print the stack " + stack);
		
		// pop(): remove and return the top element
		System.out.println("Remove " + stack.pop());
		
		// peek(): return the top element but does not remove
		System.out.println("Return " + stack.peek());
		
		System.out.println("updated stack " + stack);
		
		System.out.println("located at " + stack.search(2));
	}

}
