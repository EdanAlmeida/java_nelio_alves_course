package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		String number = sc.next();
		account.accountNumberCreation(number);
		System.out.print("Enter account holder: ");
		account.setName(sc.next());
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		double amount = 0;
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			amount = sc.nextDouble();
			account.deposit(amount);
		}
		
		
		
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println(account);
		System.out.println();
		System.out.println("=============================");
		
		System.out.println("Enter a deposit: ");
		account.deposit(sc.nextDouble());
		System.out.println(account);
		
		System.out.println("=============================");
		System.out.println("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println(account);

		sc.close();
	}

}
