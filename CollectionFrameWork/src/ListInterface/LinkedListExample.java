package ListInterface;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("Alice");
        linkedList.add("Bob");
        System.out.println("After add(E e): " + linkedList);

        
        linkedList.addFirst("Charlie");
        System.out.println("After addFirst(E e): " + linkedList);

        
        linkedList.addLast("David");
        System.out.println("After addLast(E e): " + linkedList);

        
        linkedList.add(2, "Eve");
        System.out.println("After add(int index, E element): " + linkedList);

     
        linkedList.remove();
        System.out.println("After remove(): " + linkedList);

       
        linkedList.removeFirst();
        System.out.println("After removeFirst(): " + linkedList);

       
        linkedList.removeLast();
        System.out.println("After removeLast(): " + linkedList);

       
        linkedList.remove(1);
        System.out.println("After remove(int index): " + linkedList);

        
        System.out.println("get(0): " + linkedList.get(0));

        
        linkedList.set(0, "Alice Updated");
        System.out.println("After set(int index, E element): " + linkedList);

       
        System.out.println("Size: " + linkedList.size());

        
        System.out.println("Is empty? " + linkedList.isEmpty());

       
        linkedList.clear();
        System.out.println("After clear(): " + linkedList);
    }
}

