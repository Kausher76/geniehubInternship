package ListInterface;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// Create a Vector of integers
		Vector<Integer> vector = new Vector<>();

		// Adding elements to the vector
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);

		// Accessing elements
		System.out.println("Element at index 2: " + vector.get(2)); // Output: 30

		// Updating an element
		vector.set(1, 25);
		System.out.println("Updated element at index 1: " + vector.get(1)); // Output: 25

		// Removing an element
		vector.remove(0);

		// Displaying all elements
		System.out.println("Vector elements: " + vector); // Output: [25, 30, 40]

		// Getting the size of the vector
		System.out.println("Size of vector: " + vector.size()); // Output: 3
	}
}
