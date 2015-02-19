import java.util.*;
import java.io.*;

public class Distance
{
	public static void main(String[]args)throws IOException
	{
		Random RanGen = new Random();
		Scanner read = new Scanner(new File("distance.dat"));

		int testcase = read.nextInt();
		read.nextLine();

		for(int i=0; i<testcase; i++)
		{
			int seed = read.nextInt();
			int simulation = read.nextInt();
			RanGen.setSeed(seed);
			int x1 = 0;
			int y1 = 0;
			int x2 = 0;
			int y2 = 0;

			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<Double> distance = new ArrayList<Double>();

			for(int u=0; u<simulation*4; u++)
			{
				list.add(RanGen.nextInt(1000));
			}
			for(int k=0; k<list.size(); k = k+4)
			{
				x1 = list.get(k);
				y1 = list.get(k+1);
				x2 = list.get(k+2);
				y2 = list.get(k+3);

				double calc1 = Math.pow(x2 - x1, 2);
				double calc2 = Math.pow(y2 - y1, 2);
				double calc3 = Math.sqrt(calc1 + calc2);
				distance.add(calc3);
			}
			double p=0;

			for(int l=0; l<distance.size(); l++)
			{
				p = p+distance.get(l);
			}
			p = p/distance.size();
			p = (double)Math.floor(p*1000)/1000;
			System.out.println(p);

			list.clear();
			distance.clear();
		}
	}
}