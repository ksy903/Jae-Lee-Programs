import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Factorial{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("facorial.dat"));
    int CaseN = scan.nextInt();
    while(CaseN-- > 0){
      int NUM = scan.nextInt();
      int times = 0;
      for(int i=1; i<NUM; i++){
        int go = (int)((double)NUM / (double)Math.pow(5, i));
        if(go >=1)
          times += go;
        else
          break;
      }
      out.println(times);
    }
  }
}