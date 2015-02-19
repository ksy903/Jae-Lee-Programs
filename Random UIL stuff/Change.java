import java.util.*;
import java.io.*;
public class Change
{
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);

		System.out.println("Enter the total amount: in dollars and cents:");
		double amount = read.nextDouble();
		double copy = amount;
		double divide = 0;
		double reaminder =0;
		int tenCount =0;
		int fivesCount =0;
		int oneCount =0;
		int quartersCount =0;
		int dimesCount =0;
		int nicklesCount =0;
		int penniesCount =0;

		String amountIs = Double.toString(amount);
		String firstPart = amountIs.substring(0, amountIs.length() - 4);
		String middle = amountIs.substring(amountIs.length()-4, amountIs.length()-3);
		String lastPart = amountIs.substring(amountIs.length()-2, amountIs.length());
		System.out.println(firstPart);
		System.out.println(middle);
		System.out.println(lastPart);
		char checker = ' ';
		int fiveCheck =Integer.parseInt(middle);
		tenCount = Integer.parseInt(firstPart);
		int centCount = Integer.parseInt(lastPart);
		if(fiveCheck >= 5)
		{
			fiveCheck -= 5;
			fivesCount ++;
		}
		oneCount = fiveCheck;
		boolean centCheck = false;
		while(centCheck == false)
		{
			if(centCount > 25)
			{
				centCount -= 25;
				quartersCount ++;
			}
			else
			{
				centCheck = true;
			}
		}
		centCheck = false;
		while(centCheck == false)
		{
			if(centCount > 10)
			{
				centCount -= 10;
				dimesCount ++;
			}
			else
			{
				centCheck = true;
			}
		}
		centCheck = false;
		while(centCheck == false)
		{
			if(centCount > 5)
			{
				centCount -= 5;
				nicklesCount ++;
			}
			else
			{
				centCheck = true;
			}
		}
		penniesCount = centCount;

		System.out.println("Your change of $" + amount + " is");
		System.out.println("Tens - " + tenCount);
		System.out.println("Fives - " + fivesCount);
		System.out.println("Ones - " + oneCount);
		System.out.println("Quarters - " + quartersCount);
		System.out.println("Dimes - " + dimesCount);
		System.out.println("Nickles - " + nicklesCount);
		System.out.println("Pennies - " + penniesCount);
	}

}