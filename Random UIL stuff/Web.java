import java.util.*;
import java.io.*;
import static java.lang.System.*;

class Web
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(new File("web.dat"));
		int caseNum = scan.nextInt();

		boolean end = false;
		for(int i=0; i<caseNum; i++)
		{
			ArrayList<String> webs = new ArrayList<String>();
			ArrayList<String> directions = new ArrayList<String>();
			int lineNum = scan.nextInt();
			int myWeb = 0;
			scan.nextLine();
			for(int j=0; j<lineNum; j++)
			{
				String reader = scan.nextLine();
				myWeb = 0;
				if(reader.length() == 1)
					directions.add(reader);
				else if(reader.length() > 2 && directions.size() > 0)
				{
					myWeb = webs.size()-1;
					for(int g=0; g<directions.size(); g++)
					{
						if(directions.get(g).equals("b"))
							myWeb++;
						else if(directions.get(g).equals("f"))
							myWeb--;
					}
					for(int l=webs.size(); l>=myWeb; l--)
						webs.remove(l);

					directions.clear();
				}
				else
					webs.add(reader);
			}
			myWeb = webs.size()-1;
			if(directions.size() == 0)
			{
				out.println(webs.get(webs.size()-1));
				continue;
			}
			else if(webs.size() == 0 || directions.get(0).equals("f"))
			{
				out.println("invalid");
				continue;
			}
			else
			{
				for(int g=0; g<directions.size(); g++)
				{
					if(directions.get(g).equals("b"))
						myWeb--;
					else if(directions.get(g).equals("f"))
						myWeb++;
				}
				out.println(webs.get(myWeb));
			}
		}
	}
}