
public class AccountBook {
//intermediate (multidimensional arrays)
	
	//todo: a bank will give you 2% interest on your savings stored on an account book.
	//for a certain amount of money you want to store in the account book create a multidimensional array where
	//the interest of the next 10 years is stored.
	//For that save the year and the amount of money. Write a method which takes a certain year as input (e.g. 2019) and an amount of money you would like to store
	//and returns the saving you would have for this year.

	private static int[][] initializeMatrix(int[][] matrix){
		int year = 2017;
		int amountOfMoney = 100;
		for(int i=0; i < matrix.length;i++){
			matrix[i][0] = year; 
			for(int j=1; j < matrix[i].length; j++){
				matrix[i][j] = amountOfMoney;
				amountOfMoney *= 1.02;
			}
			year++;
		}
		return matrix;
	}
	
	private static void printMatrix(int[][] matrix){
		for(int i=0; i < matrix.length;i++){
			System.out.println("Year: "+matrix[i][0]); 
			for(int j=1; j < matrix[i].length; j++){
				System.out.println("Amount of money: "+matrix[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[10][2];
		initializeMatrix(matrix);
		printMatrix(matrix);
	}
	
}
