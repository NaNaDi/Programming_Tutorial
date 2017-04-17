import java.util.Scanner;

//if-else

public class AssignGrade {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		//
		
		System.out.println("Please, write a score: ");
		scan = new Scanner(System.in);
		int input = scan.nextInt();
		double finalGrade = 0;
		if(input <= 100 && input >= 95)
			finalGrade = 1.0;
		else if(input >= 90)
			finalGrade = 1.3;
		else if(input >= 85)
			finalGrade = 1.7;
		else if(input >= 80)
			finalGrade = 2.0;
		else if(input >= 75)
			finalGrade = 2.3;
		else if(input >= 70)
			finalGrade = 2.7;
		else if(input >= 65)
			finalGrade = 3.0;
		else if(input >= 60)
			finalGrade = 3.3;
		else if(input >= 55)
			finalGrade =3.7;
		else if(input >= 50)
			finalGrade = 4.0;
		else if(input >= 45)
			finalGrade = 4.3;
		else if(input >= 40)
			finalGrade = 4.7;
		else if(input < 40)
			finalGrade = 5.0;
		
		System.out.println("The final grade is: "+finalGrade);
		
		if(finalGrade<=4.0)
			System.out.println("The student is aproved :D");
		else
			System.out.println("The student is reproved :(");
		

	}
}
