import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Bishop{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("bishop.dat"));
    int caseN = scan.nextInt();
    while(caseN-->0){
      int total = 0;
      int R = scan.nextInt();
      int C = scan.nextInt();
      int B = scan.nextInt();
      boolean[][] grid = new boolean[R][C];
      for(int i=0;i<B; i++){
        int y = scan.nextInt();
        int x = scan.nextInt();
        search(grid, y, x);
      }
      for(int r=0;r<grid.length;r++)
        for(int c=0;c<grid[0].length;c++)
          if(!grid[r][c])
            total++;
      out.println(total);
    }
  }
  static void search(boolean[][] b, int y, int x){
    int yC = y;
    int xC = x;
    int times = 4;
    while(times-- > 0){
      yC = y;
      xC = x;
      if(times == 3){
        while(yC < b.length && xC < b[0].length){
          b[yC][xC] = true;  
          yC++;
          xC++;
        }
      }
      if(times == 2){
        while(yC >= 0 && xC < b[0].length){
          b[yC][xC] = true;  
          yC--;
          xC++;
        }
      }
      if(times == 1){
        while(yC < b.length && xC >= 0){
          b[yC][xC] = true;  
          yC++;
          xC--;
        }
      }
      if(times == 0){
        while(yC >= 0 && xC >= 0){
          b[yC][xC] = true;  
          yC--;
          xC--;
        }
      }
    }
  }
}