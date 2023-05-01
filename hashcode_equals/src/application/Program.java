package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		//Equals == 100% mas é mais lento
		//HashCode == quase 100% mas é rápido (possibilidade de colisão)
		//Geralmente usa-se uma combinação entre os dois métodos
		
		Client c1 = new Client("Edan", "edan@email.com");
		Client c2 = new Client("Edan", "helena@email.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		//Só pra teste
		//Comparação de referência de memória (não pode comparar coisas desse tipo em java)
		//Embora em tipos literais (String) o compilador faça a comparação da maneira esperada (objetos)
		System.out.println(c1 == c2);
		
	}

}
