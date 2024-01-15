package MainPackage;

//What is a class ?

//Class is a blueprint of Object it can contain variables and methods
//Below is example of class person with variables and methods
//you can think class a prototype of a building just like we can make/create many building based on one prototype in the same way 
//we can create many objects of a class

class Person {
	int id;
	int age;
	String name;
	String location;

	public void walk() {
		System.out.println(name + " can walk");
	}

	public void eat() {
		System.out.println(name + " can eat");
	}

}

public class ClassExample {
	public static void main(String[] args) {
		// creating class
		Person p1 = new Person();

		// we can access variables and methods by using object name example
		// p1.variable/methods

		// setting variables
		p1.id = 1;
		p1.name = "Kausher Imam";
		p1.age = 24;
		p1.location = "Patna";

		// getting variables
		System.out.println(p1.id + "  " + p1.name + "  " + p1.age + "  " + p1.location);

		// calling methods
		p1.eat();
		p1.walk();

		Person p2 = new Person();

		// setting variables
		p2.id = 2;
		p2.name = "Nikhil";
		p2.age = 25;
		p2.location = "Mumbai";

		// getting variables
		System.out.println(p2.id + "  " + p2.name + "  " + p2.age + "  " + p2.location);

		// calling methods
		p2.eat();
		p2.walk();

	}

}
