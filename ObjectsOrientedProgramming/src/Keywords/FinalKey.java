package Keywords;

//by declaring variable/method/class as final we can manage it's access control if variable is final then it's value cannot be changed
//if method is final we cannot override that method
//if class is final we cannot inherit any class from that class

class Bike {
	final int speedlimit = 90;

//	void run() {
//		speedlimit = 400;
//	}

	final void run() {
		System.out.println("running");
	}

}

final class Bike1 {
}

//class Honda1 extends Bike1 {
//
//}

class Honda extends Bike {
//	void run() {
//		System.out.println("running safely with 100kmph");
//	}

	public class FinalKey {
		public static void main(String args[]) {
			Bike obj = new Bike();
//		obj.run();

			Honda honda = new Honda();
			honda.run();
		}

	}
}
