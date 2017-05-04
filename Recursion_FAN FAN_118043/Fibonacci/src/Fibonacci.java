import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please enter an integer number");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a=1;
		int b=1;
		int c=0;
		if(n==1 || n==2){
			System.out.print("the corresponding Fibonacci number is 1");
		}
		else{
			for(int i=3;i<=n;i++){
					c=a+b;
					a=b;
					b=c;
			}
			System.out.print("the corresponding Fibonacci number is " +c);
		}		
	}
}
