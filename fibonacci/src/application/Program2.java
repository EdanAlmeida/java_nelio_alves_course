
package application;

public class Program2 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 20; i++) {
            System.out.print("(" + i + "):" + fibo(i) + "\t");
        }

	}
	
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
	}
}
