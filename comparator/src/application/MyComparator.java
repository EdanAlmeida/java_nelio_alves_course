package application;

import java.util.Comparator;

import entities.Product;

//Interface funcional tem apenas um método abstrato

public class MyComparator implements Comparator<Product> {

	//Os critérios de comparação ficam separados da classe Product / melhora a questão da manutenção do código
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}