import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Mountain{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("mountain.dat"));
    int caseN = scan.nextInt();
    while(caseN-->0){
      int size = scan.nextInt();
      Cell[][] grid = new Cell[size][size];
      int y=0, x=0, max=Integer.MIN_VALUE;
      for(int r=0;r<size;r++)
        for(int c=0;c<size;c++){
          grid[r][c] = new Cell();
          int copy = scan.nextInt();
          grid[r][c].value = copy;
          if(copy > max){
            max = copy;
            y = r;
            x = c;
          }
      }
      for(int r=0;r<size;r++)
        for(int c=0;c<size;c++){
          if(r-1>=0)
            grid[r][c].up = grid[r-1][c];
          if(r+1<size)
            grid[r][c].down = grid[r+1][c];
          if(c-1>=0)
            grid[r][c].left = grid[r][c-1];
          if(c+1<size)
            grid[r][c].right = grid[r][c+1]; 
      }
      Cell copy = grid[0][0];
      Cell.search(copy);
      if(grid[y][x].touched)
        out.println("YES");
      else
        out.println("NO");
    }
  }
}
class Cell{
  Cell up, down, left, right;
  int value;
  boolean touched = false;
  Cell(){};
  static void search(Cell c){
    c.touched = true;
    if(c.up!=null&&c.up.value >= c.value-2 && c.up.value <= c.value+1&&!c.up.touched){
      Cell.search(c.up);
    }
    if(c.down!=null&&c.down.value >= c.value-2 && c.down.value <= c.value+1&&!c.down.touched){
      Cell.search(c.down);
    }
    if(c.left!=null&&c.left.value >= c.value-2 && c.left.value <= c.value+1&&!c.left.touched){
      Cell.search(c.left);
    }
    if(c.right!=null&&c.right.value >= c.value-2 && c.right.value <= c.value+1&&!c.right.touched){
      Cell.search(c.right);
    }
  }
}