package SetInterface;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);

        System.out.println("TreeSet elements: " + treeSet);

        // Getting the first and last elements
        Integer firstElement = ((SortedSet<Integer>) treeSet).first();
        Integer lastElement = ((SortedSet<Integer>) treeSet).last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Navigating the set
        Integer higher = ((TreeSet<Integer>) treeSet).higher(3);
        Integer lower = ((TreeSet<Integer>) treeSet).lower(3);
        Integer ceiling = ((TreeSet<Integer>) treeSet).ceiling(3);
        Integer floor = ((TreeSet<Integer>) treeSet).floor(3);
        System.out.println("Higher than 3: " + higher);
        System.out.println("Lower than 3: " + lower);
        System.out.println("Ceiling of 3: " + ceiling);
        System.out.println("Floor of 3: " + floor);

        // Getting subsets
        SortedSet<Integer> subset = ((SortedSet<Integer>) treeSet).subSet(2, 8);  // [2, 5]
        SortedSet<Integer> headSet = ((SortedSet<Integer>) treeSet).headSet(5);   // [1, 2]
        SortedSet<Integer> tailSet = ((SortedSet<Integer>) treeSet).tailSet(2);   // [2, 5, 8]
        System.out.println("Subset: " + subset);
        System.out.println("Headset: " + headSet);
        System.out.println("Tailset: " + tailSet);
    }
}
