package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		//Erro de compilação pq o List<Integer> não é um subtipo de List<Object> (Erro de upcasting)
//		List<Object> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers;
		
		//O supertipo de qualquer tipo de lista é o 'List<?>' (Curinga)
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
		
		//Ex:
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		
		//Todavia, não é possível adicionar dados a uma lista tipo curinga
		
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
		System.out.println(obj);
		}
	}

}
