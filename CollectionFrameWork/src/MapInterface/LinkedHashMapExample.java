package MapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Carol", 28);
        linkedHashMap.put("Bob", 30);
        

        // Iterating through the map (insertion order)
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Accessing an element to change the order
        linkedHashMap.get("Bob");

        // Iterating through the map after access (access order)
        linkedHashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}

