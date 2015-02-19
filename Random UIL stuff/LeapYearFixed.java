import java.util.*;
import java.io.*;
public class LeapYearFixed
{
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);

		System.out.println("Please write the year to test and see if it is a leap year");
		int year = read.nextInt();
		if(year % 4 == 0 && year % 100 != 0)
		{
			System.out.println("Yes it is a leap year");
		}
		else if(year % 400 ==0)
		{
			System.out.println("Yes it is a leap year");
		}
		else
		{
			System.out.println("No it is not a leap year");
		}
	}
}