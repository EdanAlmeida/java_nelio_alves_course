package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program6_Pipelines {

	public static void main(String[] args) {

	List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
	//map -> operação intermediária
	Stream<Integer> st1 = list.stream().map(x -> x * 10);
	//toArray -> operação terminal
	System.out.println(Arrays.toString(st1.toArray()));
	
	//reduce -> operação terminal
	int sum = list.stream().reduce(0, (x, y) -> x + y);
	System.out.println("SUM = " + sum);
	
	List<Integer> newList = list.stream()
			.filter(x -> x % 2 == 0)
			.map(x -> x * 10)
			.collect(Collectors.toList());
	
	System.out.println(Arrays.toString(newList.toArray()));
		
		
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


