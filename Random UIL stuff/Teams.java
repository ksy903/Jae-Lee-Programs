import java.util.*;
import java.io.*;

public class Teams
{
	public static void main(String[]args)throws IOException
	{
		Scanner read = new Scanner(new File("teams.dat"));

		int caseNum=read.nextInt();

		int age = 0;
		int skill =0;
		int min = 0;

		ArrayList<Integer> ages = new ArrayList<Integer>();
		ArrayList<Integer> skills = new ArrayList<Integer>();
		ArrayList<Integer> orderAge = new ArrayList<Integer>();
		ArrayList<Integer> orderSkill = new ArrayList<Integer>();



		for(int i=1; i<= caseNum; i++)
		{
			age = read.nextInt();
			skill = read.nextInt();

			ages.add(age);
			skills.add(skill);
			orderAge.add(age);
			orderSkill.add(skill);

			for(int p=0; p<ages.size(); p++)
			{
				for(int q=0; q<ages.size(); q++)
				{
					if(ages.get(p) < ages.get(q))
					{
						min++;
					}
				}
				if(min != 0)
				{
					min ++;
					orderAge.set(ages.size()-min, ages.get(p));
					orderSkill.set(ages.size()-min, skills.get(p));
				}
				else
				{
					min ++;
					orderAge.set(ages.size()-min, ages.get(p));
					orderSkill.set(ages.size()-min, skills.get(p));
				}
				min = 0;
			}
			int values = 0;
			int values2 =0;
			int v = orderSkill.size()/2;
			if(orderSkill.size()%2 != 0)
			{
				v ++;
			}
			for(int k=0; k<orderSkill.size(); k ++)
			{
				if(k < v)
				{
					values += orderSkill.get(k);
				}
				else
				{
					values2 += orderSkill.get(k);
				}
			}
			System.out.println(Math.abs(values - values2));
		}
	}
}