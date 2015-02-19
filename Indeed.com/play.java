import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class play{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("play.dat"));
    while(scan.hasNext()){
      int num = scan.nextInt();
      int X = num + (num - 1);
      int times = 1;
      boolean down = false;
      for(int r=0;r<X;r++){
          if(r == num-1)
            down = true;
          if(!down){
            for(int i=0;i<times;i++)
              out.print("*");
            times+=2;
          }
          if(down){
            for(int i=0;i<times;i++)
              out.print("*");
            times -= 2;
          }
        out.println();
      }
      out.println();
    }
  }
}