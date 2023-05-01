package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	/*Covariância == Get permitido (acessar elementos pelo índice) Put gerar um erro (não é possível adicionar elementos)*/
	/*Contravariância == oposto de variância*/

public class Program_2 {

	public static void main(String[] args) {
		// Princípio GET/PUT
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		//Classe Number fica entre os tipos primitivos e a classe Object
		//Muito interessante para algumas soluções
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);

	}
	
	//A lista de origem é de 'variância'
	//A lista de destino é de 'contravariância'
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) { //acessa os dados
			destiny.add(number); //insere os dados
		}
	}
	
	public static void printList(List<?> list) {
		for (Object object : list) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

}
