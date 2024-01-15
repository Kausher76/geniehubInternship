package ListInterface;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();

		
		stack.push("apple");
		stack.push("banana");
		stack.push("cherry");

		
		System.out.println("Top element: " + stack.peek()); 

		
		System.out.println("Popped element: " + stack.pop());

		
		System.out.println("Is stack empty? " + stack.isEmpty());

	
		System.out.println("Stack elements: " + stack); 

		
		System.out.println("Size of stack: " + stack.size()); 
	}
}
