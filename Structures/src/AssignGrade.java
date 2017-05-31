import java.util.Scanner;

//if-else

public class AssignGrade {

	private static Scanner scan;

	public static void main(String[] args) {

		// todo: when executing the program you will be ask to write a score.
		// The program converts the score then into a grade and prints that
		// grade (1.0, 1.3, 1.7, ...)
		// Note that the student passed when the student gets a score of 50.0
		// points (4.0)
		//

		System.out.println("Please enter a score: ");
		scan = new Scanner(System.in);
		boolean exit = false;
		boolean firstExecution = true;

		while (!exit) {

			if (!firstExecution)
				System.out.println("Please enter a score: ");

			while (!scan.hasNextDouble()) {
				System.out.println("Enter a valid number (example: 50 or 50,0)");
				scan = new Scanner(System.in);
			}

			double grade = scan.nextDouble();
			double finalGrade = 0;
			if (grade <= 100 && grade >= 95)
				finalGrade = 1.0;
			else if (grade >= 90)
				finalGrade = 1.3;
			else if (grade >= 85)
				finalGrade = 1.7;
			else if (grade >= 80)
				finalGrade = 2.0;
			else if (grade >= 75)
				finalGrade = 2.3;
			else if (grade >= 70)
				finalGrade = 2.7;
			else if (grade >= 65)
				finalGrade = 3.0;
			else if (grade >= 60)
				finalGrade = 3.3;
			else if (grade >= 55)
				finalGrade = 3.7;
			else if (grade >= 50)
				finalGrade = 4.0;
			else if (grade >= 45)
				finalGrade = 4.3;
			else if (grade >= 40)
				finalGrade = 4.7;
			else if (grade < 40)
				finalGrade = 5.0;

			System.out.println("The final grade is: " + finalGrade);

			if (finalGrade <= 4.0)
				System.out.println("The student is aproved :D");
			else
				System.out.println("The student is reproved :(");

			System.out.println("Do you want to exit? (Please type yes or no) :");
			scan = new Scanner(System.in);
			if (scan.next().trim().toUpperCase().equals("YES"))
				exit = true;

			firstExecution = false;
		}
		
		System.out.println("Bye bye");
		scan.close();

	}
}
