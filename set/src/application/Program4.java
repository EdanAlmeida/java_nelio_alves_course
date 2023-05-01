package application;

import java.util.Set;
import java.util.TreeSet;
import entities.Product;

public class Program4 {
	
	//Já o TreeSet armazena os dados em uma árvore rubro-negra - usando o compareTo ou o Comparator
	//Assim, precisa-se implementar o Comparable na classe
	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p : set) {
			System.out.println(p);
		}
	}
}
