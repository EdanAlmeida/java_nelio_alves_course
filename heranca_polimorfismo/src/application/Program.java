package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Edan Almeida", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Aline Moreira", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Geovana Mayer", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
//		Account acc = new Account(1001, "Edan Almeida", 0.0);
//		
//		BusinessAccount bacc = new BusinessAccount(1002, "Murilo Benicio", 0.0, 500.0);
//		
//		//UPCASTING -> relação 'é um'
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "Mario Games", 0.0, 1000.0);
//		Account acc3 = new SavingsAccount(1004, "Maria Tete", 100.0, 0.5);
//		
//		
//		//DOWNCASTING -> 
//		BusinessAccount acc4 = (BusinessAccount)acc2; //forçar o casting
//		acc4.loan(100.0);
//		
////		BusinessAccount acc5 = (BusinessAccount)acc3; //foi instanciada como SavingsAccount == nem sempre dá certo o downcasting
//		
//		/*Necessário testar antes de fazer o downcasting*/
//		if (acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount)acc3;
//			acc5.loan(200.0);
//			System.out.println("Loan!");
//		}
//		
//		if (acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount)acc3;
//			acc5.updateBalance();
//			System.out.println("Update!");
//		}
		
	}

}
