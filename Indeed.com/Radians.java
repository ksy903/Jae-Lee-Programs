import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Radians{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("radians.dat"));
    while(scan.hasNext()){
      int num = scan.nextInt();
      if(num % 180 == 0){
        if(num/180 > 1)
          out.printf("%d degrees = %dPI radians%n", num, (num/180));
        else if(num/180 == 1)
          out.printf("%d degrees = PI radians%n", num);
        else if(num/180 == 0)
          out.printf("%d degrees = 0 radians%n", num);
        else if(num/180 == -1)
          out.printf("%d degrees = -PI radians%n", num);
      }
      else{
        out.printf("%d degrees = %.2fPI radians%n", num, ((double)num/(double)180));
      }
    }
  }
}