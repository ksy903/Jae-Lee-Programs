import java.util.*;
import java.io.*;

public class Encryption
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("encryption.dat"));

		int caseNum = read.nextInt();
		read.nextLine();

		String lineRead = "";
		char checker = ' ';
		boolean thing = false;
		String num = "";
		ArrayList<Integer> collect = new ArrayList<Integer>();
		int number =0;
		long Bolt = 2;
		boolean winner = false;
		long remainder =0;
		int amountCorrect =0;

		for(int i=0; i< caseNum; i++)
		{
			lineRead = read.nextLine();
			lineRead += " ";
			for(int p=0; p<lineRead.length(); p++)
			{
				checker = lineRead.charAt(p);
				thing =  Character.isWhitespace(checker);
				if(thing)
				{
					number = Integer.parseInt(num);
					num = "";
					collect.add(number);
				}
				else if(!thing)
				{
					num += String.valueOf(checker);
				}
			}
		}
	}
}