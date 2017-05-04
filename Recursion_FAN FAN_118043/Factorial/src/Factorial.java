import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please enter an integer which is bigger than 0 "+"\n");
		Scanner input= new Scanner(System.in);
		int number=input.nextInt();
		int output = 1;
		for(int i=number;i>0;i--){
			output=output*i;
		}
		System.out.print("the factorial value is "+ output);
	}
}
