package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Carol", 28);

        // Getting values
        System.out.println("Getting value for 'Alice': " + hashMap.get("Alice"));

        // Checking existence
        System.out.println("Contains key 'Bob'? " + hashMap.containsKey("Bob"));
        System.out.println("Contains value 28? " + hashMap.containsValue(28));

        // Removing a key-value pair
        hashMap.remove("Carol");

        // Size and clear
        System.out.println("HashMap size: " + hashMap.size());
        hashMap.clear();
        System.out.println("HashMap size after clearing: " + hashMap.size());

        // Example with putAll
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("David", 35);
        anotherMap.put("Eve", 29);
        hashMap.putAll(anotherMap);
        System.out.println("HashMap after putAll: " + hashMap);

        // Iterating through keys
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Iterating through values
        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // Iterating through key-value pairs using entrySet
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


