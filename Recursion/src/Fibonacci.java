
public class Fibonacci {
	// todo: implement a recursive function which takes an integer value as
	// inputs and outputs the corresponding Fibonacci number.
	// if you don't know what Fibonacci numbers are you can read it here:
	// https://en.wikipedia.org/wiki/Fibonacci_number

	public static int calcFibonacci(int n) {

		if(n == 0){
			return 0;
		}
		else if(n<=2){
			return 1;
		}else{
			return calcFibonacci(n-1)+calcFibonacci(n-2);
		}

	}

	public static void main(String[] args) {
		System.out.println(calcFibonacci(5));
	}
}
