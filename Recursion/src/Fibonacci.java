import java.util.Scanner;
public class Fibonacci {
	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number
public static int placeFibonacci(int n) {
	if (n == 0 || n == 1) {
		return n;
	} else {
		return placeFibonacci(n - 2) + placeFibonacci(n - 1);
	}
}

public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	System.out.println("At the place" + n + " of the Fibonacci list, is the number: " + placeFibonacci(n));
}

}

