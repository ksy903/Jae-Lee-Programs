import java.util.*;
import java.io.*;

public class Stealing
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("stealing.dat"));

		int caseNum = read.nextInt();

		int n=0;
		int m=0;
		int t=0;

		int timeCount = 0;

		for(int i=0; i<caseNum; i++)
		{
			n = read.nextInt();
			m = read.nextInt();
			t = read.nextInt();

			if(m>n)
			{
				System.out.println(t);
			}
			else
			{
				while(n>m)
				{
					n -= m;
					timeCount += 2;
				}
				timeCount ++;

				System.out.println(timeCount * 10);
			}
			timeCount =0;
		}
	}
}