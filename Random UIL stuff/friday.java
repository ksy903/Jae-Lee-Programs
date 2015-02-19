import java.util.*;
import java.io.*;

class friday
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(new File("friday.in"));

		int THE_MAIN_COUNTER = 0;
		int years = scan.nextInt();
		int[] daysCount = new int[7];
		int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int baseYr = 1900;
		functions f = new functions();
		for(int j=baseYr; j<baseYr + years; j++)
		{
			if(j%4 == 0)
			{
				if(j%100 == 0)
				{
					if(j%400 == 0)
					{

					}
				}
				else
				{

				}
			}
		}
	}
}

class functions
{
	public void normalYr(int[] a, int[] b, int bigCount)
	{

	}
	public void leapYr(int[] a, int[] b, int bigCount)
	{

	}
}