package SetInterface;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("banana"); // Adding a duplicate element (ignored)

        System.out.println("HashSet: " + hashSet);

        // Removing an element
        hashSet.remove("banana");
        System.out.println("HashSet after removing 'banana': " + hashSet);

        // Checking existence
        System.out.println("Contains 'apple': " + hashSet.contains("apple"));

        // Size and empty check
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // Iterating over elements
        System.out.print("Iterating over HashSet: ");
        for (String item : hashSet) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Using an iterator
        Iterator<String> iterator = hashSet.iterator();
        System.out.print("Using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Clear the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
