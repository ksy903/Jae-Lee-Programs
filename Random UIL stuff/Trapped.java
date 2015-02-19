import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Data
{
	int Weight;
	int Value;
	int ItemNum;

	public Data(int w, int v, int pos)
	{
		Weight = w;
		Value = v;
		ItemNum = pos;
	}
	public String toString()
	{
		return "Item " + ItemNum + "= " + "Value: " + Value + " Weight: " + Weight;
	}
}

class Trapped
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(in);
		out.println("How Many Items?");
		int itemNum = scan.nextInt();
		out.println("Size of Bag?");
		int bagSize = scan.nextInt();
		ArrayList<Data> list = new ArrayList<Data>();
		for(int i=0; i<itemNum; i++)
		{
			out.println("Enter Value for item " + i+1);
			int v = scan.nextInt();
			out.println("Enter Weight for item " + i+1);
			int w = scan.nextInt();
			list.add(new Data(w, v, i+1));
		}
		int[][] Value = new int[itemNum+1][bagSize+1];
		int[][] Keep = new int[itemNum+1][bagSize+1];

		for(int r = 1; r<Value.length; r++)
		{
			for(int c = 1; c<Value[0].length; c++)
			{
				if(list.get(r).Weight > c)
				{
					Value[r][c] =  0;
					Keep[r][c] = 0;
				}
				else
				if(list.get(r).Weight == c && list.get(r).Value < Value[r-1][c])
				{
					Value[r][c] =  Value[r-1][c];
					Keep[r][c] = 0;
				}
				else
				if(list.get(r).Weight == c)
				{
					Value[r][c] = list.get(r).Value;
					Keep[r][c] = 1;
				}
				else
				if(list.get(r).Weight > c && list.get(c).Value+Value[r-1][c-list.get(r).Weight] >= Value[r-1][c])
				{
					Value[r][c] = list.get(r).Value + Value[r-1][c-list.get(r).Weight];
					Keep[r][c] = 1;
				}
				else
				{
					Value[r][c] = Value[r-1][c];
					Keep[r][c] = 0;
				}
			}
		}

		ArrayList<Data> keep = new ArrayList<Data>();
		int bagS = bagSize;

		for(int r = 0; r<
	}
}