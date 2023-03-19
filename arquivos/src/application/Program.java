package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\edlui\\Documents\\WORKSPACE\\java_nelio_alves\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {; //mais rápido
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}


//String path = "C:\\Users\\edlui\\Documents\\WORKSPACE\\java_nelio_alves\\in.txt";
//
//FileReader fr = null;
//BufferedReader br = null;
//
//try {
//	fr = new FileReader(path);
//	br = new BufferedReader(fr); //mais rápido
//	
//	String line = br.readLine();
//	
//	while (line != null) {
//		System.out.println(line);
//		line = br.readLine();
//	}
//} catch(IOException e) {
//	System.out.println("Error: " + e.getMessage());
//} finally {
//	try {
//		if (br != null) {
//			br.close();
//		}
//		if (fr != null) {
//			fr.close();
//		}
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}

//File file = new File("C:\\Users\\edlui\\Documents\\WORKSPACE\\java_nelio_alves\\in.txt");
//Scanner sc = null;
//
//try {
//	sc = new Scanner(file);
//	while (sc.hasNextLine()) {
//		System.out.println(sc.nextLine());
//	}
//} catch (IOException e) {
//	System.out.println("Error " + e.getMessage());
//} finally {
//	if (sc != null) {
//	sc.close();
//	}
//}