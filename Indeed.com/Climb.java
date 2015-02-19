import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Climb{
  public static void main(String[] args)throws IOException{
    Scanner scan = new Scanner(new File("climb.dat"));
    int caseN = scan.nextInt();
    while(caseN-- > 0){
      int x = scan.nextInt(), y = scan.nextInt(), m = scan.nextInt();
      int total = 0, times = 0, current=0;
      while(current < m){
        total += x;
        current += x;
        times++;
        if(current == m){
          break;
        }
        else if(current > m){
          total -= total - m;
          break;
        }
        else{
          current -= y;
          total += y;
        }
      }
      out.println(times + " " + total);
    }
  }
}