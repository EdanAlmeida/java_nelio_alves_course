package application;

import entities.Property;
import entities.RealStateAgent;
import entities.Sale;

public class Program {

	public static void main(String[] args) {
		
		Sale sale = new Sale(1, new RealStateAgent("acb123", "Malice da Costa"), new Property("Apartamento", 150000.00));
		
		System.out.println(sale);
		
	}

}
