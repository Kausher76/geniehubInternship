package Inheritance;


class Shape {
	void draw() {
		System.out.println("Drawing a shape.");
	}
}


class Circle extends Shape {
	void draw() {
		System.out.println("Drawing a circle.");
	}
}


class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing a rectangle.");
	}
}


class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing a triangle.");
	}
}

public class HierarchicalInheritanceExample {
	public static void main(String[] args) {
		// Creating instances of the subclasses
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Triangle myTriangle = new Triangle();

		// Calling methods from the inherited classes
		myCircle.draw(); // Specific to Circle class
		myRectangle.draw(); // Specific to Rectangle class
		myTriangle.draw(); // Specific to Triangle class
	}
}
