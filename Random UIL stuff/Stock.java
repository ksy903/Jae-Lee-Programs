import java.util.*;
import java.io.*;

public class Stock
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("stock.dat"));

		int companyNum = read.nextInt();
		read.nextLine();

		int days = 0;
		String companyName = "";


		int day = 0;
		int dayafter = 0;
		int daybefore = 0;

		int reader = 0;

		boolean buy = false;
		boolean sell = false;

		ArrayList<Integer> dayCount = new ArrayList<Integer>();
		ArrayList<Integer> stockPrice = new ArrayList<Integer>();
		for(int i=0; i<companyNum; i++)
		{
			days = read.nextInt();
			companyName = read.next();

			 System.out.println(companyName);

			for(int h=1; h<=days; h++)
			{
				reader = read.nextInt();

				stockPrice.add(reader);
				dayCount.add(h);
			}

			for(int k=0; k<stockPrice.size(); k++)
			{
				buy = false;
				sell = false;

				if(k==0)
				{
					day = stockPrice.get(k);
					dayafter = stockPrice.get(k+1);
					if(day > dayafter)
					{
						sell = true;
					}
					else if(dayafter > day)
					{
						buy = true;
					}
				}
				else if(k==stockPrice.size()-1)
				{
					day = stockPrice.get(k);
					daybefore = stockPrice.get(k-1);

					if(day > daybefore)
					{
						sell = true;
					}
					else if(daybefore > day)
					{
						buy = true;
					}
				}
				else
				{
					day = stockPrice.get(k);
					daybefore = stockPrice.get(k-1);
					dayafter = stockPrice.get(k+1);

					if((dayafter > day) && (daybefore > day))
					{
						buy = true;
					}
					else if((day > dayafter) && (day > daybefore))
					{
						sell = true;
					}
				}
				if(buy == true)
				{
					System.out.println(dayCount.get(k) + " BUY");
				}
				else if(sell == true)
				{
					System.out.println(dayCount.get(k) + " SELL");
				}
			}

			dayCount.clear();
			stockPrice.clear();
		}
	}
}
