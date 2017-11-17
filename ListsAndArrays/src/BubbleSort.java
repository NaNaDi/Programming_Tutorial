
public class BubbleSort {
//intermediate
	public static int[] bubbleSort(int x[]) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 1; j < (x.length - 1); j++) {
				if (x[j - 1] > x[j]) {
					int a = x[j];
					x[j] = x[j - 1];
					x[j - 1] = a;
				}
			}
		}	
		return x;
	}
	
	public static void main(String[] args) {
		int[] x = {2, 15, 4, 8, 22, 30};
		bubbleSort(x);
		for (int i = 0; i < x.length; i++) {
		System.out.print(x[i] + " ");
		}
	}
	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	
}
