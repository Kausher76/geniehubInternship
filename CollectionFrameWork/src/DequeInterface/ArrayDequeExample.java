package DequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<Integer> arrayDeque = new ArrayDeque<>();

        
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.offerFirst(3);
        arrayDeque.offerLast(4);
        
        System.out.println(arrayDeque);

        
        try {
            System.out.println("Removing first element: " + arrayDeque.removeFirst());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Polling first element: " + arrayDeque.pollFirst());
        
        try {
            System.out.println("Removing last element: " + arrayDeque.removeLast());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Polling last element: " + arrayDeque.pollLast());

        
        try {
            System.out.println("First element: " + arrayDeque.getFirst());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Peek first element: " + arrayDeque.peekFirst());
        
        try {
            System.out.println("Last element: " + arrayDeque.getLast());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        
        System.out.println("Peek last element: " + arrayDeque.peekLast());

       
        System.out.println("Deque size: " + arrayDeque.size());
        System.out.println("Is deque empty? " + arrayDeque.isEmpty());

        
        arrayDeque.clear();
        
        System.out.println("Is deque empty after clearing? " + arrayDeque.isEmpty());
    }
		
}


