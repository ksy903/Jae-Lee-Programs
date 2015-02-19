import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class tictactoe{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("tictactoe.dat"));
    int caseN = scan.nextInt();scan.nextLine();
    while(caseN-- > 0){
      char[][] grid = new char[3][3];
      String line = scan.nextLine();
      int index = 0;
      for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
          grid[r][c] = (line.charAt(index));
          index++;
        }
      }
      String[] all = new String[8];
      boolean filled = true;
      Arrays.fill(all, "");
      for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
          if(grid[r][c] == '*')filled = false;
          if(r==0)all[0] += grid[r][c];
          if(r==1)all[1] += grid[r][c];
          if(r==2)all[2] += grid[r][c];
          if(c==0)all[3] += grid[r][c];
          if(c==1)all[4] += grid[r][c];
          if(c==2)all[5] += grid[r][c];
          if(r==c)all[6] += grid[r][c];
          if(r+c == 2)all[7] += grid[r][c];
        }
      }
      boolean x = false, o = false;
      for(String s:all){
        if(s.equals("XXX"))
          x = true;
        if(s.equals("OOO"))
          o = true;
      }
      if(filled && !x && !o)
        out.println("TIE");
      else if(x)
        out.println("X");
      else if(o)
        out.println("O");
      else
        out.println("INC");
    }
  }
}
             