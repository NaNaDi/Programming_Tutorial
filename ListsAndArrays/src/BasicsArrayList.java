import java.awt.List;
import java.util.ArrayList;

public class BasicsArrayList {
//beginner
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList
	
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	
	private static void addValue(Integer value, ArrayList<Integer> arrayList){
		arrayList.add(value);
	}
	private static void printElements(ArrayList<Integer> arrayList){
		for(int i = 0; i < arrayList.size(); i++){
			System.out.println(arrayList.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		//Initialize the array with values from 0 to 9
		for(int i = 0; i < 10; i++){
			addValue(i,arrayList);
		}
		
		printElements(arrayList);
		
		
	}
	

}
