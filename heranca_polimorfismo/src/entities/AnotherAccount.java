package entities;

public class AnotherAccount extends SavingsAccount {

	@Override
	public void withdraw(double amount) {
		balance -= amount + 2;
	}
	
}
