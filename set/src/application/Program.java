package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// Set => uma interface que representa um conjunto de elementos (igual ao da
		// Álgebra);
		// HashSet => O(1) (mais rápido) porém não garante ordem;
		// TreeSet => O(log(n)) (mais lento == ordem de 1000 elementos ==
		// aproximadamente log de 10) garante a ordem;
		// LinkedHashSet => velocidade intermediária e elementos na ordem em que são
		// adicionados;
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
//		set.removeIf(x -> x.length() >= 3); usando predicados para atender algum critério (Lambda)
		set.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
	}
}
