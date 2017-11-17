
public class AccountBook {
//intermediate (multidimensional arrays)
	//todo: a bank will give you 2% interest on your savings stored on an account book.
	//for a certain amount of money you want to store in the account book create a multidimensional array where
	//the interest of the next 10 years is stored.
	//For that save the year and the amount of money. Write a method which takes a certain year as input (e.g. 2019) and an amount of money you would like to store
	//and returns the saving you would have for this year.

public static double[][] accountBook(double y) {
	double x[][] = new double[11][2];
	double year = 2017.0;
	x[0][0] = year;
	x[0][1] = y;
	for (int i=1; i<11; i++) {
		year = year + 1;
		x[i][0] = year;
		for (int j=1; j<2; j++ ) {
			x[i][j] = x[i -1][j] + x[i -1][j]*0.02;
		}
	}
	return x;
}

public static void money(double x[][], double y) {
	for (int i=0; i<x.length; i++) {
		for (int j= 0; j<x[i].length; j++) {
			if (x[i][j] == y) {
				System.out.println("The ammount of money in year " + x[i][j] + " will be " + x[i][(j + 1)]);
			}
		}
	}
}

public static void main(String[] args) {
	double x[][] = accountBook(100.0);
	for (int i=0; i<x.length; i++) {
		for (int j=0; j<x[i].length; j++) {
			System.out.println(x[i][j]);
		}
	}
	money(x, 2026);
}
}
