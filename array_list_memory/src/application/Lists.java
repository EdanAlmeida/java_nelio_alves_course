package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Edan");
		list.add("Emily");
		list.add(2, "Aline");
		list.add("Edson");
		list.add("Geovana");
		list.add("Maduh");
		
//		list.remove("Aline");
		
		for (String name : list) {
			System.out.println(name);
		}

		System.out.println("=============================");
		
		list.removeIf(x -> x.charAt(0) == 'A');
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("=============================");
		System.out.println("Index of Emily: " + list.indexOf("Emily"));
	
		System.out.println("=============================");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		
		for (String res : result) {
			System.out.println(res);
		}
		
		System.out.println("=============================");
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
