import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please enter the number of radius"+"\n");
		Scanner input= new Scanner(System.in);
		double r;
        r=input.nextDouble();
		double d=diameter(r);
		double cir=circumference(r);
		double area=area(r);
		System.out.print("the diameter is"+" "+d+"\n");
		System.out.print("the circumference is"+" "+cir+"\n");
		System.out.print("the area is"+" "+area+"\n");
	}
	public static double diameter(double r){
		double d;
		d=2*r;
		return d;
	}
	public static double circumference(double r){
		double cir;
		cir=3.14*2*r;
		return cir;
	}
	public static double area(double r){
		double area;
		area=3.14*r*r;
		return area;
		
	}
}
