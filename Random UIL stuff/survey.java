import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class survey{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("survey.dat"));
		int caseNum = scan.nextInt();
		for(int i=0; i<caseNum; i++){
			int box = scan.nextInt();
			int mail = scan.nextInt();
			String[] ans = new String[box];
			for(int u = 0; u<ans.length; u++)
				ans[u] = "";
			char[] letter = new char[mail];
			for(int v = 0; v< letter.length; v++){
				letter[v] = (char)(65 + v);
			}
			for(int j = 1; j <=ans.length; j++){
				for(int r = 0; r < letter.length; r++){
					if(j%(letter[r]-64) == 0)
						ans[j-1] += (String.valueOf(letter[r]));
				}
			}
			int MAX = 0;
			int MaxPos =0;
			int mailC = 0;
			ArrayList<Integer> maxes = new ArrayList<Integer>();
			ArrayList<Integer> onlyA = new ArrayList<Integer>();
			ArrayList<Integer> onlyThree = new ArrayList<Integer>();
			int total  = 0;
			for(int k=0; k<ans.length; k++)
			{
				if(ans[k].length() == MAX){
					MAX = ans[k].length();
					maxes.add(k+1);
				}
				else if(ans[k].length() > MAX){
					MAX = ans[k].length();
					maxes.clear();
					maxes.add(k+1);
				}
				if(k == mail-1)
					mailC = ans[k].length();
				if(ans[k].length() == 1)
					onlyA.add(k);
				if(ans[k].length() == 3)
					onlyThree.add(k);
				total += ans[k].length();
			}
			//System.out.println(Arrays.toString(ans));
			System.out.print("Box that contains the most surveys: ");
			for(int y=0; y<maxes.size(); y++)
				System.out.print(maxes.get(y) + " ");
			System.out.println();
			System.out.println("Box " + mail + " contains " + mailC + " surveys");
			System.out.print("Boxes that contain only survey A: ");
			for(int g=0;g<onlyA.size();g++)
				System.out.print(onlyA.get(g)+1 + " ");
			System.out.println();
			System.out.println("Boxes that contain exactly three surveys: ");
			for(int h=0;h<onlyThree.size();h++)
				System.out.print(onlyThree.get(h)+1 + " ");
			System.out.println();
			System.out.println("Total number of surveys stuffed: " + total);
			System.out.println();
		}
	}
}