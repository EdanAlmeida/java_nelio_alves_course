package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		// Estrutura de dados genérica, mas com dois tipos Map<key, value>
		// uso comum => cookies, local storage etc.

		// HashMap, TreeMap, LinkedHashMap
		// put(key), containsKey(key), remove(key), get(key)
		// clear(), size()
		// keySet() -> retorna um Set<key>
		// values() -> retorna um Collection<value)

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		cookies.remove("email");
		//Como não aceita duplicação de valor na chave, ele sobreescreve o valor do telefone
		cookies.put("phone", "99771133");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}
