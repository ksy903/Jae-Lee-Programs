import java.util.*;
import java.io.*;

public class Rabbits
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("rabbit.dat"));

		int caseNum =read.nextInt();
		read.nextLine();
		int size =0;
		for(int i =0; i<caseNum; i++)
		{
			size = read.nextInt();
			size--;

			int[] collect = new int[115];

			for(int p=0; p<collect.length; p++)
			{
				if(p <= 2)
				{
					collect[0] = 1;
					collect[1] = 1;
					collect[2] = 1;
				}
				else
				{
					collect[p] = collect[p-2] + collect[p-3];
				}
			}
			System.out.println(Arrays.toString(collect));
			/*
			for(int q=0; q<collect.length; q++)
			{
				if(q<=2)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println(collect[size]);
				}
			}
			*/
		}
	}
}