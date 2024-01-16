package Oops;

public class AmbiguityExample {

    
    public static int add(int a, double b) {
        return a + (int) b;
    }

    
    public static int add(double a, int b) {
        return (int) a + b;
    }

    public static void main(String[] args) {
        
        int result1 = add(5, 10.5);
        System.out.println("Result 1: " + result1);

        
        int result2 = add(7.2, 3);
        System.out.println("Result 2: " + result2);

        // The following line would result in a compilation error due to ambiguity
        // Uncommenting this line will lead to a compilation error
        // int result3 = add(4, 7);
        // System.out.println("Result 3: " + result3);
    }
}

