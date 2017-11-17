import java.util.Scanner;

public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	public static int factorial(int x) {
		if (x <= 1) {
			return 1;
		} else {
			return x * factorial(x -1);
			
		}
	}

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); 
		
		System.out.println("The factorial of number " + x + " is: " + factorial(x));
	}
}

