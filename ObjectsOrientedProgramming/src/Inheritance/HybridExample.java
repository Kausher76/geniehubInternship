package Inheritance;

//Grandfather class (Superclass)
class Grandfather {
	void tellStory() {
		System.out.println("The grandfather tells a family story.");
	}
}

//Father class inheriting from Grandfather (Hierarchical Inheritance)
class Father extends Grandfather {
	void work() {
		System.out.println("The father goes to work to support the family.");
	}
}

//Son class inheriting from Father (Hybrid Inheritance)
class Son extends Father {
	void play() {
		System.out.println("The son plays with his toys.");
	}
}

//Daughter class inheriting from Father (Hybrid Inheritance)
class Daughter extends Father {
	void study() {
		System.out.println("The daughter studies for school.");
	}
}

public class HybridExample {
	public static void main(String[] args) {
		// Creating instances of the classes
		Grandfather grandfather = new Grandfather();
		Father father = new Father();
		Son son = new Son();
		Daughter daughter = new Daughter();

		// Calling methods from the inherited classes
		grandfather.tellStory(); // Inherited from Grandfather
		father.work(); // Inherited from Father and Grandfather
		son.play(); // Inherited from Son, Father, and Grandfather
		daughter.study(); // Inherited from Daughter, Father, and Grandfather
	}
}
