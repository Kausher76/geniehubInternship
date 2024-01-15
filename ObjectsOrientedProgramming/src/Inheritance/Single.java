package Inheritance;


class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Single {
	
	public static void main(String[] args) {
		Dog myDog = new Dog();

       
		// Calling methods from the inherited class
        myDog.eat();  // Inherited from Animal class
        myDog.bark(); // Specific to Dog class
	}
	
}
