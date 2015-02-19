import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Bridge
{
    public static void main(String[] args) throws IOException
    {
    	Scanner read = new Scanner(new File("bridge.dat"));
		int caseNum = read.nextInt();
		read.nextLine();

		int convoyNum = 0;
		ArrayList<Integer> weight = new ArrayList<Integer>();
		ArrayList<Integer> time = new ArrayList<Integer>();

		int getW = 0;
		int getT = 0;

		int totalWeight = 0;
		int groupTime = 0;

		int finalTime = 0;
		for(int i=0; i<caseNum; i++)
		{
			convoyNum = read.nextInt();
			for(int p=0; p<convoyNum; p++)
			{
				getW = read.nextInt();
				getT = read.nextInt();
				weight.add(getW);
				time.add(getT);
			}
			finalTime =0;
			while(weight.size() != 0)
			{
				totalWeight = weight.get(0);
				groupTime = time.get(0);
				weight.remove(0);
				time.remove(0);
				for(int q = 0; q<weight.size(); q++)
				{
					if(totalWeight + weight.get(q) < 43)
					{
						totalWeight += weight.get(q);
						if(time.get(q) > groupTime)
						{
							groupTime = time.get(q);
						}
						weight.remove(q);
						time.remove(q);
						q=0;
					}
				}
				finalTime += groupTime;
				totalWeight = 0;
				groupTime = 0;
			}
			out.println(finalTime);
		}
    }
}
