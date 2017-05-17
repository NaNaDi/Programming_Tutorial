import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		
		String input = scan.nextLine();
		
		int sum = 0;
		while(!input.equals("s")){
			sum += Integer.parseInt(input);
			input = scan.nextLine();
		}
		
		System.out.println("Sum: "+sum);
		System.out.println("Tschuiss");
		
	}
	
}
