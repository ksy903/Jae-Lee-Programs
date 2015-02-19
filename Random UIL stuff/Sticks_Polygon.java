import java.util.*;
import java.io.*;

public class Sticks_Polygon
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("stickspolygon.dat"));

		int caseNum =  read.nextInt();
		read.nextLine();

		int stickNum = 0;
		ArrayList<Integer> stickSize  = new ArrayList<Integer>();
		int reader = 0;

		int compareFrom =0;
		int compareTo = 0;

		int biggestNum = 0;
		int okCount  = 0;

		for(int i=0; i<caseNum; i++)
		{
			okCount =0;
			compareFrom =0;
			stickNum = read.nextInt();
			read.nextLine();

			for(int h=0; h<stickNum; h++)
			{
				reader = read.nextInt();
				stickSize.add(reader);
			}
			for(int j=0; j<stickSize.size(); j++)
			{
				compareFrom += stickSize.get(j);
			}
			for(int w=0; w<stickSize.size(); w++)
			{
				compareTo = stickSize.get(w);
				if((compareFrom-compareTo) > compareTo)
				{
					okCount += 1;
				}
			}
			if(okCount <3)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(okCount);
			}
			stickSize.clear();
		}
	}
}