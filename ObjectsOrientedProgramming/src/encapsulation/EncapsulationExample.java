package encapsulation;

class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(String accountNumber) {

		this.accountNumber = accountNumber;
	}

	public void setAccountHolder(String accountHolder) {

		this.accountHolder = accountHolder;
	}

	public void setBalance(double balance) {

		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Balance cannot be negative.");
		}
	}

	public void deposit(double amount) {

		if (amount > 0) {
			this.balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {

		if (amount > 0 && amount <= balance) {
			this.balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("123456", "John Doe", 1000.0);

		System.out.println("Account Holder: " + account.getAccountHolder());
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: $" + account.getBalance());

		account.deposit(500.0);
		account.withdraw(200.0);

		System.out.println("Updated Balance: $" + account.getBalance());
	}
}
