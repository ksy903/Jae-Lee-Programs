import java.util.*;
import java.io.*;

public class Memory
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("memory.dat"));

		int caseNum = read.nextInt();
		read.nextLine();

		int vars =0;
		int formulas=0;

		ArrayList<String> varCollect = new ArrayList<String>();
		String name = "";
		String address = "";
		String value = "";

		String formula = "";
		String symbol ="";

		String checks ="";

		String forStar = "";
		String compareStar ="";

		boolean pizza = true;

		for(int i=0; i< caseNum; i++)
		{
			vars = read.nextInt();
			formulas = read.nextInt();
			read.nextLine();

			for(int p=0; p<vars; p++)
			{
				name = read.next();
				address = read.next();
				value = read.next();
				varCollect.add(name);
				varCollect.add(address);
				varCollect.add(value);
			}
			for(int q=0; q<formulas; q++)
			{
				pizza = true;
				formula = read.next();
				symbol = formula.substring(0,1);
				if(symbol.equals("*") || symbol.equals("&"))
				{
					symbol = formula.substring(0,1);
					formula = formula.substring(1);
				}
				else
				{
					pizza = false;
				}

				for(int h=0; h<varCollect.size(); h+=3)
				{
					if(formula.equals(varCollect.get(h)))
					{
						if(symbol.equals("*") && pizza == true)
						{
							forStar = varCollect.get(h+2);

							for(int r=0; r<varCollect.size(); r+=3)
							{
								compareStar = varCollect.get(r+1);
								if(forStar.equals(compareStar))
								{
									System.out.println(varCollect.get(r+2));
								}
							}
						}
						else if(symbol.equals("&") && pizza == true)
						{
							System.out.println(varCollect.get(h+1));
						}
						else
						{
							System.out.println(varCollect.get(h+2));
						}
					}
				}
			}
		}
	}
}