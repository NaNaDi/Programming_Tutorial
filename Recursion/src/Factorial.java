
public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	
	
	public static int calcFactorial(int n){
		
		if(n > 0){
			return calcFactorial(n-1)*n;
		}
		else{
			return 1;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(calcFactorial(4));
		
	}
	
}
