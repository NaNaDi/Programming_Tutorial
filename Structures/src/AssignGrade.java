import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Score: ");
		int score = scan.nextInt();
		
		double grade = ((100 - score)/50.0) * 3 + 1;
		
		 if (grade <= 4.0) {
			System.out.println("Pass with grade: " + grade);
		} else {
			System.out.println("Fail with grade: " + grade);
		} 
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
	}
}
