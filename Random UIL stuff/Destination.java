import java.util.*;
import java.io.*;

public class Destination
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("destination.dat"));

		int casenum = read.nextInt();
		read.nextLine();

		for(int i=0; i<casenum; i++)
		{
			boolean join = false;
			int x1 = read.nextInt();
			int y1 = read.nextInt();
			int x2 = read.nextInt();
			int y2 = read.nextInt();
			int directions = read.nextInt();
			read.nextLine();
			int numberTime = 0;

			if((x1 == x2) && (y1 == y2))
			{
				join = true;
			}

			for(int u =0; u<directions; u++)
			{
				if(join == false)
				{
					numberTime = numberTime + 1;
				}
				String instruction = read.next();
				int much = read.nextInt();


				for(int h=0; h<much; h++)
				{
					if(instruction.equals("north"))
					{
						y1 = y1 + 1;
					}
					else if(instruction.equals("east"))
					{
						x1 = x1 + 1;
					}
					else if(instruction.equals("south"))
					{
						y1 = y1 - 1;
					}
					else if(instruction.equals("west"))
					{
						x1 = x1 - 1;
					}
					if((x1 == x2) && (y1 == y2))
					{
						join = true;
					}
				}
			}
			if(join == true)
			{
				System.out.println(numberTime);
			}
			else if(join == false)
			{
				System.out.println("You didn't make it");
			}
		}
	}
}