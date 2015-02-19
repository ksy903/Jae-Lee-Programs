import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class XML{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("xml.dat"));
    int caseN = scan.nextInt();scan.nextLine();
    while(caseN-- > 0){
      String lineA = scan.nextLine();
      String lineB = scan.nextLine();
      if(lineA.equals(lineB))
        out.println("same");
      else{
        String[] aWords = lineA.split("[</>]+");
        String[] bWords = lineB.split("[</>]+");
        ArrayList<String> A = new ArrayList<String>();
        ArrayList<String> B = new ArrayList<String>();
        for(int i=1;i<aWords.length;i++){
          if(lineA.charAt(lineA.indexOf(aWords[i]) + aWords[i].length()) == '>'){
            A.add(aWords[i]);
          }
          if(lineB.charAt(lineB.indexOf(bWords[i]) + bWords[i].length()) == '>'){
            B.add(bWords[i]);
          }
        }
        boolean check = false;
        for(int c = 0; c<A.size();c++){
          if(!A.get(c).equals(B.get(c))){
            check = true;
            break;
          }
        }
        if(!check)
          out.println("same");
        else
          out.println("different");
      }
    }
  }
}