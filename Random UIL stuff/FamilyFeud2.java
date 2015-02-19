import java.util.*;
import java.io.*;
import static java.lang.System.*;

class FamilyFeud2
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("familyfeud2.dat"));
		int caseNum = scan.nextInt();
		for(int i=0; i<caseNum; i++)
		{
			int size = scan.nextInt();
			int left = 0;
			int right = size-1;
			int top = 0;
			char[][] board = new char[size][size];
			for(int j=0; j<board.length;j++)
			{
				for(int c=0; c<board[0].length; c++)
				{
					if(j == 0 || j == board.length-1)
					{
						board[j][c] = 'X';
					}
					if(c == 0 || c == board[0].length-1)
					{
						board[j][c] = 'X';
					}
				}
			}
			for(int r=0; r<board.length;r++)
			{
				for(int c = 0; c<board[0].length; c++)
				{
					if(left < size && top < size && right > 0)
					{
						board[left][top] = 'X';
						board[right][top] = 'X';
						left++;
						right--;
						top++;
					}
				}
			}
			for(int h=0; h<board.length; h++)
			{
				for(int k=0; k<board[0].length; k++)
				{
					out.print(board[h][k]);
				}
				out.println();
			}
		}
	}
}