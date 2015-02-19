import java.util.*;
import java.io.*;

public class RNA
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("rna.dat"));

		int caseNum = read.nextInt();
		read.nextLine();

		String line1 ="";
		String line2 ="";
		int lengthNum =0;

		boolean stateCheck = true;

		for(int i=0; i<caseNum; i++)
		{
			lengthNum = read.nextInt();
			read.nextLine();
			line1 = read.nextLine();
			line2 = read.nextLine();

			for(int p=0; p<line1.length(); p++)
			{

				if(line1.charAt(p) == 'A')
				{
					if(line2.charAt(p) != 'U')
					{
						stateCheck = false;
					}
				}
				else if(line1.charAt(p) == 'T')
				{
					if(line2.charAt(p) != 'A')
					{
						stateCheck = false;
					}
				}
				else if(line1.charAt(p) == 'G')
				{
					if(line2.charAt(p) != 'C')
					{
						stateCheck = false;
					}
				}
				else if(line1.charAt(p) == 'C')
				{
					if(line2.charAt(p) != 'G')
					{
						stateCheck = false;
					}
				}
				else
				{
					stateCheck = false;
				}
				if(stateCheck == false)
				{
					System.out.println("BAD");
					break;
				}
			}
			if(stateCheck == true)
			{
				System.out.println("GOOD");
			}
			stateCheck = true;
		}
	}
}