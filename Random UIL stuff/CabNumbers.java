import java.util.*;
import java.io.*;
import static java.lang.System.in;
public class CabNumbers{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("cabnumbers.dat"));

		int max = 1000000;
		int nums = scan.nextInt();
		System.out.println(nums);
		double a = 0, b =0;
		HashSet all = new HashSet();
		int c = 0;
		while(a++ < 50 && b++ < 50){
			c = (int)(Math.cbrt(a) + Math.cbrt(b));
			all.add(c);
		}
		ArrayList<Integer> tes = new ArrayList<Integer>();
		tes.addAll(all);
		Collections.sort(tes);
		System.out.println(tes);
	}
}