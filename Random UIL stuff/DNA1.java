import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class DNA1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("dna1.dat"));
        int caseNum = scan.nextInt();
        scan.nextLine();
        for(int i=0; i<caseNum; i++)
        {
        	String line1 = scan.nextLine();
        	String line2 = scan.nextLine();
        	outerloop: for(int k=0; k<line1.length(); k++)
        	{
        		boolean win = false;
        		int size = 0;
        		int jc = 0;
        		int kc = 0;
        		int jcc = 0;
        		for(int j=line2.length()-1; j>=0; j--)
        		{
        			jcc = 0;
        			size = 0;
        			jc = 0;
        			kc = 0;
        			if(line1.charAt(k) == line2.charAt(j))
        			{
        				jcc = j;
        				jc = j;
        				kc = k;
        				size++;
        				while(jc >0)
        				{
        					jc--;
        					kc++;
        					out.println(kc +" "+ jc);
        					if(line1.charAt(kc) == line2.charAt(jc))
        						size++;
        					else
        					{
        						if(k == (line2.length()-1)-(k+size))
        						{
        							win = true;
        							break;
        						}
        						else
        						{
        							win = false;
        							break;
        						}
        					}
        				}
        			}
        			if(win)
        			{
        				out.println(jcc-1 + " " + size);
        				break outerloop;
        			}
        		}
        	}
        }
    }
}
