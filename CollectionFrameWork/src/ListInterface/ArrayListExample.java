package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        
        // Adding elements
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        
        
        
        
        
        // Accessing elements
        System.out.println("First element: " + numbers.get(0)); // Prints "5"
        
        // Removing an element
        numbers.remove(1); // Removes element at index 1
        
        // Checking if an element exists
        if (numbers.contains(15)) {
            System.out.println("Number 15 exists.");
        }
        
        // Iterating through the ArrayList
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
