import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Data
{
	String Name;
	String Author;
	String Genre;
	public Data(String n, String a, String g)
	{
		Name = n;
		Author = a;
		Genre = g;
	}
	public String toString()
	{
		return (Name + Author + Genre);
	}
}

class AlsoPurchased
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("alsopurchased.dat"));
		ArrayList<Data> bookList = new ArrayList<Data>();
		ArrayList<String> myList = new ArrayList<String>();
		String[] cutter = new String[3];
		boolean isNum = false;
		int i=0;
		while(scan.hasNext())
		{
			String read = scan.nextLine();
			try
			{
			 	i = Integer.parseInt(read);
			 	isNum = true;
			}
			catch(Exception e)
			{
				isNum = false;
			}
			if(isNum)
			{
				break;
			}
			else if(!isNum)
			{
				cutter = read.split("\\*");
				bookList.add(new Data(cutter[0], cutter[1], cutter[2]));
			}
		}
		ArrayList<String> byAuthor = new ArrayList<String>();
		ArrayList<String> byGenre = new ArrayList<String>();
		String[] Also = new String[3];
		for(int c = 0; c<i; c++)
		{
			myList.add(scan.nextLine());
			for(int b=0; b<bookList.size();b++)
			{
				if(bookList.get(b).Name.equals(myList.get(c)))
				{
					myAuthor = bookList.get(b).Author;
					myGenre = bookList.get(b).Genre;
				}
				for(int j=0; j<bookList.size();j++)
				{
					if(myAuthor.equals(bookList.get(j).Author))
					{
						byAuthor.add(bookList.get(j).Name);
					}
					else if(myGenre.equals(bookList.get(j).Genre))
					{
						byGenre.add(bookList.get(j).Name);
					}
				}
				Collections.sort(byAuthor);
				Collections.sort(byGenre);
			}
		}
		for(int k=0; k<Also.length; k++)
		{
			if(byAuthor.size()>=3)
				Also[k] = (byAuthor.get(k));
			else
			{
				if(k < byAuthor.size())
					Also[k] = (byAuthor.get(k));
				else
				{
					Also[k] = byGenre.get(k%byAuthor.size());
				}
			}
		}
		for(int h=0; h<Also.length; h++)
		{
			out.println(Also[h]);
		}
	}
}