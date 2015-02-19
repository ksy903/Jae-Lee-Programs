import java.util.*;

class counts
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] f = new int[50];
		for(int i=0; i<10; i++)
		{
			int reader = scan.nextInt();
			if(reader < 51)
				f[reader-1]++;
		}
		System.out.println("You put these many values under 50");
		for(int j=0; j<f.length; j++)
			System.out.println(j+1 + ": " + f[j]);
	}
}