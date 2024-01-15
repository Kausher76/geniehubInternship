package Inheritance;

class Animal1 {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("The dog barks.");
	}
}

class GermanShepherd extends Dog {
	void guard() {
		System.out.println("The German Shepherd guards.");
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		// Creating an instance of the GermanShepherd class
		GermanShepherd myDog = new GermanShepherd();

		// Calling methods from the inherited classes
		myDog.eat(); // Inherited from Animal class
		myDog.bark(); // Inherited from Dog class
		myDog.guard(); // Specific to GermanShepherd class
	}
}
