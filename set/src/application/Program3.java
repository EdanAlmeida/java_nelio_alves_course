package application;

import java.util.HashSet;
import java.util.Set;
import entities.Product;

public class Program3 {
	
	public static void main(String[] args) {
		
		//Como o Set ompara os objetos?
		Set<Product> set = new HashSet<>();
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		//O resultado será falso pq a classe não possui os métodos de HashCode e Equals
		//Dessa forma a comparação é feita por ponteiramento
		//Instâncias diferentes == resultados diferentes
		//A solução é simples, só implementar os métodos na classe 'Product' xdb
		System.out.println(set.contains(prod));
	}
}
