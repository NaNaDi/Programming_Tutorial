import java.util.*;
import java.text.*;
public class AccountBook 
{	
	public static double[][] savingsCalc(double[][] a, int y, double amt)
	{		
		for(int row=0; row<a.length; row++)
		{			
			for(int column=0; column<a[row].length; column++)
			{
				if(row==0)
				{
					a[row][column]=(y+column+1);//saving increments of the year
				}else if(row ==1)
				{
					a[row][column]= amt*=1.02;//saving increments of amount including interests
				}//end if else				
			}//end inner for loop
		}//end outer for loop		
		return (a);
	}//end savingsCalc method
	
	
//###########################################          MAIN METHOD BELOW          ########################################	
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double amount=0;
		int year;
		
		Calendar now = Calendar.getInstance();
		
		double [][] account = new double[2][10];
		
		System.out.println("How much money do you want to store?");
		do
		{
			while(!scan.hasNextDouble())
			{
				scan.next();
				System.out.println("The amount must be a number.");
			}//end while
			amount = scan.nextDouble();
			
			if(amount<=0.0)
			{
				System.out.println("The entered amount must be greater than zero.");
			}//end if
		}while(amount<=0.0);
		
		System.out.println("From which year would you like to plot the interests?");
		do
		{
			while(!scan.hasNextInt())
			{
				scan.next();
				System.out.println("The year must be a number.");
			}//end while
			year = scan.nextInt();
			
			if(year <(now.get(Calendar.YEAR)))
			{
				System.out.println("The entered year must be greater than or equal to the current one.");
			}//end if
		}while(year <(now.get(Calendar.YEAR)));

		//Calling the method to compute and save interests in the array
		account = savingsCalc(account, year, amount);
		
		System.out.println("Projections for a "+amount+ " savings account for the next 10 years starting from "+year+" are as follows: ");
		
		DecimalFormat yearFormat=new DecimalFormat("#");
		DecimalFormat amountFormat=new DecimalFormat("#.##");
		
		for(int i=0;i<account.length;i++)
		{			
			for(int j=0;j<account[i].length;j++)
			{
				if (i==0)
				{					
					//System.out.print("[");
					System.out.print("["+yearFormat.format(account[i][j])+"]\t");
					//System.out.print();
					
				}else if (i==1)
				{
					//System.out.print();
					System.out.print("["+amountFormat.format(account[i][j])+"]\t");
					//System.out.print();
				}//end if else
				
			}//end inner for loop
			System.out.println();
		}//end outer for loop
		scan.close();
	}//end savingsCalc method
	
	
	
	
//intermediate (multidimensional arrays)
	
	//todo: a bank will give you 2% interest on your savings stored on an account book.
	//for a certain amount of money you want to store in the account book create a multidimensional array where
	//the interest of the next 10 years is stored.
	//For that save the year and the amount of money. Write a method which takes a certain year as input (e.g. 2019)
	//and an amount of money you would like to store and returns the saving you would have for this year.

}
