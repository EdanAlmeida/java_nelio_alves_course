package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Product product = new Product();

	System.out.println("Enter product data: ");
	System.out.print("Name: ");
	product.setName(sc.next());
	System.out.print("Price: $");
	product.setPrice(sc.nextDouble());
	System.out.print("Quantity: ");
	product.addProducts(sc.nextInt());;

	System.out.println(product);

	System.out.println();
	System.out.print("Enter the number of products to be added in stock: ");
	int qtdAdd = sc.nextInt();
	product.addProducts(qtdAdd);

	System.out.println(product);

	System.out.println();
	System.out.print("Enter the number of products to be removed in stock: ");
	int qtdRem = sc.nextInt();
	product.removeProducts(qtdRem);

	System.out.println(product);
			
			
	sc.close();	
	}

}


/*PROGRAMA 1*/
//Locale.setDefault(Locale.US);
//Scanner sc = new Scanner(System.in);
//
//Triangle x, y;
//x = new Triangle();
//y = new Triangle();
//
//System.out.println("Enter the measures of triangle X: ");
//x.a = sc.nextDouble();
//x.b = sc.nextDouble();
//x.c = sc.nextDouble();
//
//System.out.println("Enter the measures of triangle Y: ");
//y.a = sc.nextDouble();
//y.b = sc.nextDouble();
//y.c = sc.nextDouble();
//
//double areaX = x.area();
//double areaY = y.area();
//
//System.out.println("Area Triangle X: " + areaX);
//System.out.println("Area Triangle Y: " + areaY);
//
//sc.close();




/*PROGRAMA 2*/
//Product product = new Product();
//
//System.out.println("Enter product data: ");
//System.out.print("Name: ");
//product.name = sc.next();
//System.out.print("Price: $");
//product.price = sc.nextDouble();
//System.out.print("Quantity: ");
//product.quantity = sc.nextInt();
//
//System.out.println(product);
//
//System.out.println();
//System.out.print("Enter the number of products to be added in stock: ");
//int qtdAdd = sc.nextInt();
//product.addProducts(qtdAdd);
//
//System.out.println(product);
//
//System.out.println();
//System.out.print("Enter the number of products to be removed in stock: ");
//int qtdRem = sc.nextInt();
//product.removeProducts(qtdRem);
//
//System.out.println(product);




/*PROGRAMA 3*/
//Scanner sc = new Scanner(System.in);
//
//System.out.println("Enter radius: ");
//double radius = sc.nextDouble();
//
//double c = Calculator.circumference(radius);
//double v = Calculator.volume(radius);
//
//System.out.printf("Circumference: %.2f%n", c);
//System.out.printf("Circumference: %.2f%n", v);
