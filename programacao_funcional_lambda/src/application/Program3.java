package application;

public class Program3 {
	

	public static void main(String[] args) {
		
		/*Programação Imperativa*/
		Integer sum = 0;
		for (Integer x : list) {
			sum += x;
		}
		
		/*Programação Funcional*/
		Integer sum = list.stream().reduce(0, Integer:: sum);
		
	}

}