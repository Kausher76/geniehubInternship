package Keywords;


//super key is used to access the immediate parent variables or methods of the class
class Father{
	public String name = "India";
}
class Child extends Father {
	String name = "Pakistan";
	public void name() {
		System.out.println("My name is " +name);
		System.out.println( "My father's name is " + super.name);
	}
}

public class SuperKey {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.name();
	}
}
