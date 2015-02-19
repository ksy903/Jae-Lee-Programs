import java.util.*;
import java.io.*;

public class Lottery
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("lottery.dat"));

		int linenum = read.nextInt();
		read.nextLine();
		for(int i=0; i<linenum; i++)
		{
			String myNum = read.next();
			String urNum = read.next();
			int moneyCount = 0;

			boolean firstlong = true;
			if(myNum.length() >= urNum.length())
			{
				firstlong = true;
			}
			else
			{
				firstlong = false;
			}

			if(firstlong == true)
			{
				for(int h=0; h<urNum.length(); h++)
				{
					char gets = urNum.charAt(urNum.length()-(h+1));
					char train = myNum.charAt(myNum.length()-(h+1));

					if(gets == train)
					{
						moneyCount = moneyCount+1;
					}
				}
			}
			else
			{
				for(int j=0; j<myNum.length(); j++)
				{
					char gets = urNum.charAt(urNum.length()-(j+1));
					char train = myNum.charAt(myNum.length()-(j+1));

					if(gets == train)
					{
						moneyCount = moneyCount+1;
					}
				}
			}
			System.out.println("$" + moneyCount*10);
		}
	}
}