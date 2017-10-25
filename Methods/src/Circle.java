import java.util.Scanner;

public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	public static double diameter(double r) {
		double d = 2 * r;
		return  d;
	}
	
	public static double circ(double r) {
		double pi = Math.PI ;
		double c = 2 * pi * r ;
		return c ;
	}
	
	public static double area(double r) {
		double pi = Math.PI ;
		double a = pi * r * r ;
		return a ;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Radius: ");
		Double r = scan.nextDouble();
		
		System.out.println(diameter(r));
		System.out.println(circ(r));
		System.out.println(area(r));
	}
}
