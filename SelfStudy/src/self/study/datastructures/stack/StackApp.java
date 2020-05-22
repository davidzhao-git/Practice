package self.study.datastructures.stack;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
