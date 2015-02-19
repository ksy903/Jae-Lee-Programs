import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class spending{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("spending.dat"));
    int itemN = scan.nextInt();scan.nextLine();
    for(int i=0;i<itemN;i++){
      String line = scan.nextLine();
      out.println(line.split("[a-z $$]+")[0]);
    }
  }
}