import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Number: ");
		int number = scan.nextInt();
		
		
		for (int count = 0; count < number; count ++) {
			if (count % 2 != 0) {
				System.out.println(count);
			}
		}
		
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
