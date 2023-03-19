package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		
		
		sc.close();
	}

}


/*ARRAYS - 1*/
//System.out.print("Enter the 'N' value: ");
//int n = sc.nextInt();
//
//double[] vetor = new double[n];
//
//for (int i = 0; i < n; i++) {
//	System.out.print("Enter the height of person " + (i + 1) + ": ");
//	double height = sc.nextDouble();
//	vetor[i] = height;
//}
//
//double sum = 0;
//
//for (int i = 0; i < vetor.length; i++) {
//	sum += vetor[i];
//	System.out.println("Height of person " + (i+1) + ": " + vetor[i]);
//}
//
//double average = sum / n;
//System.out.println("Average height: " + String.format("%.2f", average));


/*ARRAYS - 2*/
//int n = sc.nextInt();
//Product[] vect = new Product[n];
//
//for (int i = 0; i < vect.length; i++) {
//	String name = sc.next();
//	double price = sc.nextDouble();
//	Product prod = new Product(name, price);
//	vect[i] = prod;
//}
//
//for (int i = 0; i < vect.length; i++) {
//	System.out.println(vect[i]);
//}


/*Boxing and Unboxing - Wrapper*/
//int x = 20;
//Integer obj = x;
//
//System.out.println(obj);
//
//int y = obj;
//System.out.println(y);
