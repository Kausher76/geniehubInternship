package Keywords;

//n Java, the this keyword is used to refer to the current instance of the class. 
//It can be used to differentiate instance variables from local variables when they have the same name, 
//as well as to invoke the current object's methods.
class Example {
	private int x;

	void setX(int x) {
		this.x = x; // 'this' refers to the instance variable
	}
}

class Example1 {
	void method1() {
		System.out.println("Inside method1");
	}

	void method2() {
		this.method1(); // Using 'this' to call another method of the same object
	}
}

public class ThisKeyInJava {

}
