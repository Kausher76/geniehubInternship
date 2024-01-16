package Oops;

class Add {

	public Add(int a, int b) {
		System.out.println("Sum of " + a +" and " +  b + " = "  + (a+b));
	}

	public Add(int a, int b, int c) {
		this(a, b);
		System.out.println("Sum of " + a +" , " +  b  +" and " + c + "  = "  + (a+b + c));
	}

}

public class ConstructorChaining {
	public static void main(String[] args) {
		Add a1 = new Add(5, 9, 8);
	}
}
