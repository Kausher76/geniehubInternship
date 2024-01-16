package Thread;
class X extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
public class NameThread {
	public static void main(String[] args) {
		X x1 = new X();
		System.out.println("Name of Thread = " + x1.getName());
		x1.start();
		x1.setName("My thread");
		System.out.println("Name of Thread = " + x1.getName());
	}
}
