import java.util.*;
import java.io.*;

public class Json
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("json.dat"));
		int caseNum = read.nextInt();
		String lineRead ="";

		ArrayList<String> all =  new ArrayList<String>();

		String name ="";
		String key ="";
		String obj ="";


		for(int i=0; i<caseNum; i++)
		{
			lineRead = read.nextLine();
			String[] contain = lineRead.split("[.= ]+");
			if(contain.length == 1)
			{

			}
			else
			{
				for(int p=0; p<3; p+=3)
				{
					name = contain[p];
					key = contain[p+1];
					obj = contain[p+2];

					HashMap name = new HashMap();
					name.put(key, obj);
				}
			}
		}
	}
}