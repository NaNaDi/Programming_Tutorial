import java.util.Scanner;

public class structures {

	public static void main(String[] args) {
		// First part of exercise
		System.out.print("Input the score"+"\n");
		Scanner input1= new Scanner(System.in);
		double x=input1.nextDouble();
		double y=1+3*(100-x)/50;
		System.out.print("Your score is "+y+"\n");
		if(y<=4.0)
		{
			System.out.print("you pass the exam"+"\n");
		}
		// Second part of exercise
		System.out.print("Input the number"+"\n");
		
		Scanner input2=new Scanner(System.in);
		int z=input2.nextInt();
		for (int i=0; i<=z; i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+"\n");
			}
		}
	}
}
