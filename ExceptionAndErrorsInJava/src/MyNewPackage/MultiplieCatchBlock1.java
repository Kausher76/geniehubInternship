package MyNewPackage;

public class MultiplieCatchBlock1 {
	public static void main(String[] args) {
		try {
			int [] a =  new int[5];
			a[5] = 6 / 0;
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
	}

}
