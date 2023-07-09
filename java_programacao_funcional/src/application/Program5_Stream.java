package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program5_Stream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 6, 10, 7);
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Edan", "Helena", "Jana nana");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(15).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(50).toArray()));
		
	}
}

/*Operações intermediárias (pipeline) Stream
 * 
 * - filter -> 
 * - map -> 
 * - peek -> 
 * - distinct -> 
 * - sorted -> 
 * - skip -> 
 * - limit (*) -> 
 * 
 * (*) -> short-circuit [pegar apenas um valor determinado de dados dentro da stream]
 * 
 * */

/*Operações terminais (pipeline) Stream
 * 
 * - forEach -> 
 * - forEachOrdered -> 
 * - toArray ->
 * - reduce ->
 * - collect ->
 * - min ->
 * - max ->
 * - count ->
 * - anyMatch(*) ->
 * - allMatch(*) ->
 * - noneMatch(*) ->
 * - findFirst(*) ->
 * - findAny(*) ->
 * 
 * (*) -> Short circuit
 * */


