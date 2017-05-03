import java.awt.peer.SystemTrayPeer;

public class Basics {
//beginner
	
	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element
	
	private static int sizeOfArray(int[] array){
		return array.length;
	}
	
	private static int[] dropLastElement(int[] array){
		int[] newArray = new int[array.length-1];
		for(int i = 0; i < newArray.length; i++){
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	private static int sumElements(int[] array){
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum;
	}
	
	private static boolean checkElement(int element, int[] array){
		for(int i = 0; i<array.length; i++){
			if(array[i] == element)
				return true;
		}
		return false;
	}
	
	private static int[] initializeArray(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = i+3;
		}
		return array;
	}
	
	private static void printElements(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] array = new int[4];
		array = initializeArray(array);
		printElements(array);
		
		System.out.println("Size: "+sizeOfArray(array));
		System.out.println("Sum: "+sumElements(array));
		
		if(checkElement(4, array))
			System.out.println("Element has been found");
		else
			System.out.println("The element was not found");
		
		array = dropLastElement(array);
		printElements(array);
		
	}
}
