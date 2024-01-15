package MapInterface;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put(3, "Alice");
        treeMap.put(1, "Bob");
        treeMap.put(2, "Carol");

        // Retrieving values
        System.out.println("Value for key 2: " + treeMap.get(2));

        // Navigational operations
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        System.out.println("Key lower than 2: " + treeMap.lowerKey(2));
        System.out.println("Key higher than 2: " + treeMap.higherKey(2));

        // Submap view
        Map<Integer, String> subMap = treeMap.subMap(1, 3); // Range [1, 3)
        System.out.println("Submap: " + subMap);

        // Removing a key
        treeMap.remove(1);

        // Checking if a key exists
        System.out.println("Contains key 1? " + treeMap.containsKey(1));
    }
}
