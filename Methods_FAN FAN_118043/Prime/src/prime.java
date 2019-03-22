import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please enter a natural number"+"\n");
		Scanner input= new Scanner(System.in);
		int r;
		int a=0;
        r=input.nextInt();
        if(r==0 || r==1 ||r==2){
        	System.out.print(r+" is not prime"+"\n");
        }
        else{
        	for(int i=2; i<r;i++){
        		if(r%i==0){
        			a=a+1;
        		}
        	}
        	if(a==0){
        		System.out.print(r+" is prime"+"\n");
        	}else{
        		System.out.print(r+" is not prime"+"\n");
        	}
        }
	}

}
