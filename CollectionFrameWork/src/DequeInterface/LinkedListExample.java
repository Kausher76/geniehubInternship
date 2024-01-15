package DequeInterface;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		Deque<Integer> arrayListLike = new LinkedList<>();

		
		arrayListLike.add(1); 
		arrayListLike.add(2); 
		arrayListLike.addFirst(3); 
		arrayListLike.addLast(4); 

		
		System.out.println("First element: " + arrayListLike.getFirst());
		System.out.println("Last element: " + arrayListLike.getLast());

	
		System.out.println("Removing first element: " + arrayListLike.removeFirst());
		System.out.println("Removing last element: " + arrayListLike.removeLast());

		
		System.out.println("ArrayList size: " + arrayListLike.size());

		
		System.out.println("Is ArrayList empty? " + arrayListLike.isEmpty());

		
		arrayListLike.clear();
		System.out.println("Is ArrayList empty after clearing? " + arrayListLike.isEmpty());

	}

}
