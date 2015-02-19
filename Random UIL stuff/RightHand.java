import java.util.*;
import java.io.*;

public class RightHand
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("righthand.dat"));

		int casenum = read.nextInt();
		read.nextLine();

		int boardSize = 0;

		String line = "";
		char gets = ' ';

		int posX = 0;
		int posY =0;
		boolean leftWard = false;

		for(int i=0; i<casenum; i++)
		{
			boardSize = read.nextInt();
			read.nextLine();
			char [][] board = new char [boardSize][boardSize];
			for(int p=0; p<board.length; p++)
			{
				line = read.nextLine();
				System.out.println(line);
				for(int q=0; q<board[p].length; q++)
				{
					board[p][q] = line.charAt(q);
				}
			}
			for(int p=0; p<board.length; p++)
			{
				for(int q=0; q<board[p].length; q++)
				{
					if()
				}
			}
		}
	}
}