package stream_chapter_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
//		List<Integer> numbersPlus10 = numbers.stream().map(x -> x + 10).collect(Collectors.toList());
//		
//		numbersPlus10.forEach(element -> {System.out.println(element);});
		
//		numbers.stream().map(x -> x + 10).forEach(element -> {System.out.println(element);});
		
		numbers.stream().filter(x -> x % 2 == 1).forEach(element -> {System.out.println(element);});
		
		List<Integer> lista = Stream.iterate(1, x -> x * 2 + 1).limit(20).collect(Collectors.toList());
		for(Integer number : lista) {
			System.out.println(number);
		}

	}

}
