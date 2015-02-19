import java.util.*;
import java.io.*;
public class BeanCount
{
	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);

		System.out.println("Enter jelly bean length(cm):");
		double length = read.nextDouble();
		System.out.println("Enter jelly bean height(cm):");
		double height = read.nextDouble();
		System.out.println("Enter jar size (mL)");
		int size = read.nextInt();

		double calc = (5 * Math.PI * length * (height * height));
		calc = calc / 24;
		double calc2 = (size * .698);
		calc2 = calc2/calc;
		calc2 = Math.floor(calc2);

		System.out.println("Estimate for number of jelly beans with average");
		System.out.println("length: " + length);
		System.out.println("height: " + height);
		System.out.println("in a jar of size " + size + " mL is");
		System.out.printf("%.0f", calc2);
	}
}