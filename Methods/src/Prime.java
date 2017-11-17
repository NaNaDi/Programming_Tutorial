import java.util.Scanner;


public class Prime {
	
	public static boolean prime(int n) {
		
		if (n <= 1) {
			return false;
		} else if (n <= 3 ) {
			return true;
		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		} else {
			for (int i = 5; i * i <= n; i = i + 6 ) {
				if (n % i == 0 || n % (i + 2) == 0) {
					return false; 
				}
			return true;
			} 
		} return true; 
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		
		System.out.println("The number " + n + " is prime: " + prime(n));
		//todo: write a method which tells you if a given number is a prime or not
		
	}
	
}
