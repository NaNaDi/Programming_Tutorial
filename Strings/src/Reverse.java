import java.util.Scanner;

//intermediate

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: take an String as input and reverse it. Then print it.
		
		String input = scan.nextLine();
		String reverse = "";
		for(int i = input.length()-1; i >= 0 ; i--){
			char c = input.charAt(i);
			reverse += String.valueOf(c);
		}
		System.out.println(reverse);
	}

}
