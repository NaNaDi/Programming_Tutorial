import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		
		System.out.println("Please, write a score: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if(input <= 100 && input >= 95){
			System.out.println(1.0);
		}
		else if(input >= 90){
			System.out.println(1.5);
		}
		else if(input < 90 && input >= 85){
			System.out.println(2.0);
		}
		else if(input < 85 && input >= 80){
			System.out.println(2.5);
		}
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		//
	}
}
