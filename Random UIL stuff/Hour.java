import java.util.*;
import java.io.*;
import static java.lang.System.out;

class Horas{
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("hour.dat"));
		int caseN = scan.nextInt();
		scan.nextLine();
		for(int i=0; i<caseN; i++){
			String ans = scan.nextLine();
			String[] day = ans.split("[/ ]");
			GregorianCalendar d = new GregorianCalendar();
			d.set(Calendar.MONTH, Integer.parseInt(day[0]));
			d.set(Calendar.DATE, Integer.parseInt(day[1]));
			d.set(Calendar.YEAR, Integer.parseInt(day[2]));
			int s = Integer.parseInt(day[3]);
			if(s == 30){
				while(s-- > 0){
					out.println(d.get(d.DATE));
					d.add(d.DATE, 1);
				}
			}
			else
				d.add(d.DATE, s);
			//out.println("DATE: " + d.DATE + " DAY_OF_MONTH: " + d.DAY_OF_MONTH);
			//DATE and DAY_OF_MONTH are the same value
			//out.println("DATE: " + d.DATE + " DATE: " + Calendar.DAY_OF_MONTH);
			//d and Calendar are both the same value

			out.println(d.get(d.MONTH) +"/"+ d.get(d.DATE)+"/"+ d.get(d.YEAR));


		}
	}
}