package SetInterface;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("apple");
        linkedHashSet.add("cherry");
        linkedHashSet.add("banana");
        linkedHashSet.add("banana"); // Adding a duplicate element (ignored)

        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Removing an element
        linkedHashSet.remove("banana");
        System.out.println("LinkedHashSet after removing 'banana': " + linkedHashSet);

        // Checking existence
        System.out.println("Contains 'apple': " + linkedHashSet.contains("apple"));

        // Iterating over elements
        System.out.print("Iterating over LinkedHashSet: ");
        for (String item : linkedHashSet) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Using an iterator
        Iterator<String> iterator = linkedHashSet.iterator();
        System.out.print("Using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Clear the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}

