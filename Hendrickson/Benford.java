import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Benford{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("benford.dat"));
    int caseN = scan.nextInt();
    while(caseN-->0){
      int cases = scan.nextInt();scan.nextLine();
      int Ones = 0;
      for(int i=0;i<cases;i++){
        String s = scan.nextLine();
        if(s.charAt(0)=='1')
          Ones++;
      }
      double div = (double)Ones / (double)cases * 100;
      if(div >= 25 && div <= 35){
        out.println("PASSED");
      }
      else{
        out.printf("%s: %.2f%%\n", "FAILED: ", div);
      }
    }
  }
}