package entities;

public class Account {

	private String accountNumber;
	private String name;
	private double amount;
	
	public Account() {
		
	}

	public Account(String accountNumber, String name, double amount) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void accountNumberCreation(String a) {
		this.accountNumber = a;
	}

	public void deposit(double amount) {
		this.amount += amount - 5.0;
	}

	public void withdraw(double amount) {
		if (this.amount - (amount + 5.0) >= 0) {
		this.amount -= amount + 5.0;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
	}

	@Override
	public String toString() {
		return "Account Number = " + accountNumber + ", Name = " + name + ", Balance = $" + String.format("%.2f", amount);
	}

}
