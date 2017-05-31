import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		
		String input = scan.nextLine();
		String output = "";
		int i = 0;
		while(i < input.length()){
			char c = input.charAt(i);
			int countNumbers = 0;
			if(isNumber(c)){
				countNumbers++;
				String numberString = String.valueOf(c);
				char nextChar = input.charAt(i+1);
				/*
				 * try to discover if the next char is a number. 
				 * If so, it is concatenate to the previous number
				 */
				for(int l = i+1; l < input.length() && isNumber(nextChar); l++){
					if(l>i+1)
						numberString += String.valueOf(nextChar);
					nextChar = input.charAt(l);
					countNumbers++;
				}
				int number = Integer.parseInt(numberString);
				for(int j = 0; j < number; j++){
					output += nextChar;
				}
			}else{
				/*
				 * Verifies if the previous character is a number.
				 * If so, it should print the character. 
				 * If the first character of the input is a letter, the letter should be printed.
				 */
				if(i == 0)
					output += c;
				else if(!isNumber(input.charAt(i-1))){
					output += c;
				}
			}
			if(countNumbers > 0)
				i += countNumbers;
			else
				i++;
		}
		System.out.println(output);
	}
	
	public static boolean isNumber(char c){
		if(c >= '0' && c <= '9')
			return true;
		else 
			return false;
	}
}
