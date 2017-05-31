
public class BubbleSort {
	// intermediate

	// todo: sort an array using bubblesort.
	// if you don't know how bubblesort works you can read it here:
	// http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm

	private static int[] bubbleSort(int[] array) {
		int temp;
		int size = array.length;
		while (size > 1) {
			for(int i = 0; i < size; i++) {
				// swap positions
				if (size-1 != i && array[i] > array[i+1]) {
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
			size--;
		}
		return array;
	}
	
	private static void printElements(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,1,3,10,9,2};
		System.out.println("Printing the original array: ");
		printElements(array);
		System.out.println("Sorting...");
		bubbleSort(array);
		System.out.println("Array sorted: ");
		printElements(array);
	}
}
