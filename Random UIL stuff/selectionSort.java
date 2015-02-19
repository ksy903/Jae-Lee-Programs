import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class selectionSort
{
	public static ArrayList<Integer> doSelectionSort(ArrayList<Integer> s)
	{
		int hold, temp;
		for(int i=0; i<s.size(); i++)
		{
			hold = i;
			for(int j = i+1; j<s.size(); j++)
			{
				if(s.get(j) < s.get(hold))
					hold  = j;
			}
			s.set(hold, s.get(hold)^s.get(i));
			s.set(i, s.get(hold)^s.get(i));
			s.set(hold, s.get(hold)^s.get(i));
		}
		return s;
	}

	public static void main(String[]args)
	{
		Scanner read = new Scanner(System.in);

		System.out.println("Plese enter a number. Type\"n\" to stop");

		ArrayList<Integer> collection = new ArrayList<Integer>();
		String cont = read.next();
		int reader = 0;
		int counter = 0;
		while(!cont.equals("n") || !cont.equals("N"))
		{
			reader = read.nextInt();
			collection.add(reader);
			cont = read.next();
			counter ++;
		}
		ArrayList<Integer> sorted = doSelectionSort(collection);
		out.println("The inputs in sorted order are:");
		out.println(sorted);
	}
}