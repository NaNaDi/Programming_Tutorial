//Bonus

public class Sudoku{

	/*
		Todo: Generate a Sudoku with random values.
		The number of given values in the grid should
		be chosen according to the difficulty level.
		There are 3 difficulty levels:
		Easy, Medium and High.
		Let the user decide on the difficulty of the game.
		The user chooses coordinates in the grid and enters a value.
		After each input, check if the entered value is valid.
		Congratulate the user when he or she solved the Sudoku.
	*/

	public static void main(String[] args) {
		System.out.println("   0  1  2    3  4  5   6  7  8");
		System.out.println("  -------------------------------");
		for(int x = 0; x<9; x++){
			System.out.print(x + " |");
			for(int y = 0; y<9; y++){
				System.out.print(" - ");
				if(y%3==2){
					System.out.print("|");
				}
			}
			System.out.println();
			if(x%3==2){
				System.out.println("  -------------------------------");
			}
		}

	}

}