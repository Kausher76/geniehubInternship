package MyNewPackage;

import java.util.Scanner;

class AgeException extends RuntimeException {
	public AgeException(String message) {
		super(message);
	}
}

public class UserDefinedException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Your Age Please!");
			int age = scanner.nextInt();
			if (age < 18) {
				throw new AgeException("Sorry you cannot vote your age should be more than 18");
			} else {
				System.out.println("Welcome to voting");
			}
			
		} catch (AgeException e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
		System.out.println("This Line proves that exception handling keeps normal flow of program ");
	}
}
