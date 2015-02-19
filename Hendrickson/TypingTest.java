import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class TypingTest{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("typingtest.dat"));
    int caseN = scan.nextInt();
    while(caseN-->0){
      int time = scan.nextInt();
      String[] words = scan.nextLine().split(" ");
      float div = (float)time / (float)60.0;
      out.println(Math.round(((float)words.length-1) / div) + " WPM");
    }
  }
}