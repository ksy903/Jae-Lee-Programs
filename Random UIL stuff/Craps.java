import java.util.*;
import java.io.*;

public class Craps
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(System.in);
		Random RanGen = new Random();

		boolean winState = false;

		int dice1 =0;
		int dice2 =0;

		int hold =0;
		int test =0;

		int count =0;
		while(winState == false)
		{
			dice1 = RanGen.nextInt(6)+1;
			dice2 = RanGen.nextInt(6)+1;

			System.out.println("Your die #1 rolled " + dice1 + " Your die #2 rolled " + dice2);

			if((dice1 + dice2 == 7 && count == 0) || (dice1 + dice2 == 11 && count == 0))
			{
				winState = true;
				System.out.println("You Win! You got a " + (dice1 + dice2));
			}
			else if((dice1 + dice2 == 2 && count == 0 )|| (dice1 + dice2 == 3 && count == 0) || (dice1 + dice2 == 12&& count == 0))
			{
				System.out.println("You Lose! You got a " + (dice1 + dice2));
				winState = true;
			}
			else if(count == 0)
			{
				hold = dice1 + dice2;
			}
			else
			{
				test = dice1 + dice2;
				if(test == hold)
				{
					System.out.println("You win by rolling the same number twice! you number was " + test);
					winState = true;
				}
				else if(test == 7)
				{
					System.out.println("You Lose! You got a " + (test));
					winState = true;
				}
			}
			count++;
		}
	}
}