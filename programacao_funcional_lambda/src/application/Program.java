package application;

import java.util.Arrays;

public class Program {
	public static int globalValue = 3;

	public static void main(String[] args) {
		int[] vect = new int[] { 3, 4, 5 };
		
		//o resultado depende de uma variável que está fora da função
		//não há transparênria referencial => o comportamento depende do valor externo
		changeOddValues(vect);
		System.out.println(Arrays.toString(vect));
		
		/*A transparência referencial é algo muito forte na programação funcional
		 * <> da programação imperativa
		 * 
		 * Objetos imutáveis => código mais simples e de fácil manutenção*/
		
		/*Programação Funcional:
		 * Funções => objetos de primeira ordem == */
	}

	public static void changeOddValues(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}