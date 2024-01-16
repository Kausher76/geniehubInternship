package Thread;

class A extends Thread {
    public void run(){
        try{
            for (int i = 0; i < 11; i++) {
            if(i % 2 == 0) {System.out.println(i);}
            Thread.sleep(1000);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
    }
}

class B extends Thread {
    public void run(){
        for (int i = 0; i < 11; i++) {
            if(i % 2 != 0) {System.out.println(i);}
            try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
    }
}

class C extends Thread {
	public void run() {
		int x = 6;
		while (x != 0) {
			System.out.println("Inside thread C");
			x--;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoin {
    public static void main(String[] args) {
        A a1 = new A();
        a1.start();
        B b1 = new B();
        C c1 = new C();
        
        try {
			a1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
        b1.start();
        c1.start();
        
        
    }
}