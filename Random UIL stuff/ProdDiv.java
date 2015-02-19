import java.util.*;
import java.io.*;

public class ProdDiv
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("proddiv.dat"));

		int caseNum = read.nextInt();
		read.nextLine();

		int a = 0;
		int b = 0;

		int range = 0;
		ArrayList<Integer> primeCount = new ArrayList<Integer>();
		ArrayList<Integer> numstoCheck = new ArrayList<Integer>();
		int get =0;

		for(int i=0; i<caseNum; i++)
		{
			a = read.nextInt();
			b = read.nextInt();
			range = b-a;
			for(int p=0; p<=range; p++)
			{
				numstoCheck.add(a+p);
			}
			for(int q=0; q<numstoCheck.size(); q++)
			{
				get = numstoCheck.get(q);
				if(get == 2)
				{
					primeCount.add(get);
				}
				for(int h=2; h<=get-1; h++)
				{
					if(get % h == 0)
					{
						break;
					}
					else if(h == get-1 || get == 2)
					{
						primeCount.add(get);
					}
				}
			}
			System.out.println(primeCount.size());
			numstoCheck.clear();
			primeCount.clear();
		}
	}
}