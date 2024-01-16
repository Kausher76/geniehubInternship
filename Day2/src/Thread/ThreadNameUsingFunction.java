package Thread;

class First extends Thread {

	public First(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	
}

public class ThreadNameUsingFunction {
	public static void main(String[] args) {
		First f1 = new First("This is my first thread");
		f1.start();
		System.out.println(f1.getName());
	}
}
