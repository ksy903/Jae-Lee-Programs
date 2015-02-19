import java.util.*;
import java.io.*;
public class GallonsWasted
{
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);

		System.out.println("Please enter the faucet drips per minute");
		double drips = read.nextDouble();

		System.out.println("Please enter how many days the faucet was dripping");
		int days = read.nextInt();

		double calculation = (drips * 60 * 24 * days) / 15140;
		System.out.println("A faucet with " + drips + " drips per minute over " + days + " days will waste " + calculation);
	}
}