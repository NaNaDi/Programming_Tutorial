
public class Basics {
//beginner
	
	public static void length(int[] x) {
		System.out.println("The length of the array is: " + x.length);
		
	}
	
	public static void dropElement(int[] x) {
		int y[]  = new int[x.length -1];
		for (int i = 0; i < y.length; i++) {
			y[i] = x[i];
		}
		for (int i = 0; i < y.length; i++) {
			System.out.println("Array is now x[" + i + "]: " + y[i]);	
		}
		
	}
	
	public static void sum(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("The sum of of all elements of the array is: " + sum);
	}
	
	public static void check(int x[], int element) {
		for (int i = 0; i < x.length; i++) {
			if (x[i] == element) {
				System.out.println("The " + element + " is in row " + i); 
			} 
		}
	}
	
	public static void main(String[] args) {
		int[] x = {2, 5, 7, 8, 9, 25, 55};
		length(x);
		dropElement(x);
		sum(x);
		check(x, 9);
	}
	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element

}
