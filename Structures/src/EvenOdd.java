import java.util.Scanner;

//loops

public class EvenOdd {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Please enter a Integer value: ");

		int number = scan.nextInt();

		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("\nEnd of the program. Bye bye :)");

		// todo: The program takes a number as input.
		// It then goes through all integer values till reaching that value and
		// prints all the odd ones.

	}

}
