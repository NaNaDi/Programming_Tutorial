import java.util.Scanner;

public class Circle {
	// todo: add some methods to compute a circle's diameter, circumference and
	// area.
	// print some outputs to confirm you methods are working right.

	
	public static double diameter(double radious) {
		return radious * 2;
	}

	public static double circumference(double diameter) {
		return diameter * Math.PI;
	}
	
	public static double area(double radious){
		return Math.PI*(radious*radious);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the value of the radious: ");
		int radious = scan.nextInt();
		System.out.println("Diameter: "+diameter(radious));
		System.out.println("Circumference: "+circumference(diameter(radious)));
		System.out.println("Area: "+area(radious));
	}
	
}
