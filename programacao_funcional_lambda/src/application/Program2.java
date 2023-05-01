package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program2 {
	
	/*Programação Funcional:
	 * Funções => objetos de primeira ordem == a função pode ser passada como argumento para outra função
	 * além de que pode ser retornado por uma função*/
	
	/*O que é uma expressão lambda?
	 * Função anônima de primeira classe*/
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.sort(Program::compareProducts);
		list.forEach(System.out::println);
		}
}