import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class bad{

	public static String Do(ArrayList<String> s, String n){
		int pos = 0;
		String ans = "";
		boolean changed = false;
		for(String d:s){
			pos = 0;
			if(n.toLowerCase().contains(d.toLowerCase())){
				changed = true;
				pos = n.toLowerCase().indexOf(d.toLowerCase(), pos);
				ans = n.substring(0, pos) + d + "_" + n.substring(pos + d.length(), n.length());
				break;
			}
		}
		if(changed)
			return ans;
		else
			return n;
	}

	public static void main(String[] args) throws IOException{
		Scanner name = new Scanner(new File("bad.dat"));
		Scanner element = new Scanner(new File("elements.dat"));
		ArrayList<String> arg = new ArrayList<String>();
		int index = 0;
		while(element.hasNext()){
			arg.add(element.nextLine().split(" - ")[1]);
		}
		Collections.sort(arg);
		while(name.hasNext()){
			String first = Do(arg, name.next());
			String last = Do(arg, name.next());
			out.println(first + " " + last);
		}
	}
}