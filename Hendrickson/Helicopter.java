import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Helicopter{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("helicopter.dat"));
    int caseN = scan.nextInt();
    while(caseN-- > 0){
      int x = scan.nextInt();
      int y = scan.nextInt();
      Cell[][] grid = new Cell[y][x];
      for(int r=0;r<y;r++){
        for(int c=0;c<x;c++){
         grid[r][c] = new Cell(scan.nextInt());
        }
      }
      for(int r=0;r<y;r++){
        for(int c=0;c<x;c++){
          if(r-1 >= 0)
           grid[r][c].up = grid[r-1][c];
          if(r+1 < y)
           grid[r][c].down = grid[r+1][c];
          if(c-1 >= 0)
           grid[r][c].left = grid[r][c-1];
          if(c+1 < x)
           grid[r][c].right = grid[r][c+1];
        }
      }
      int max = Integer.MIN_VALUE;
      int R = 0, C = 0, num = 0, l = 0, w =0;
      for(int r=0;r<y;r++){
        for(int c=0;c<x;c++){
          int val = Cell.search(grid[r][c]);
          if(val > max){
            max = val;R = r;C = c;num = grid[r][c].value;l=0;w=0;
          }
          else if(val == max){
            if(grid[r][c].value > num){
              R = r; C = c; num = grid[r][c].value;l=0;w=0;
            }
            if(r == R && grid[r][c].value == num){w++;}
            else if(grid[r][c].value == num){l++;}
          }
        }
      }
      out.println("Area: " + max + " square blocks");
      out.println("Start location: " + R + " " + C);
      out.println("Width: " + w);
      out.println("Length: " + l);
    }
  }
}
class Cell{
  Cell up, down, left, right;
  int value;
  boolean touched = false;
  int size = 0;
  Cell(int i){value = i;}
  static int search(Cell c){
    c.touched = true;
    c.size++;
    if(c.up!=null&&c.up.value==c.value&&!c.up.touched){
      Cell.search(c.up);
    }
    if(c.down!=null&&c.down.value==c.value&&!c.down.touched){
      Cell.search(c.down);
    }
    if(c.left!=null&&c.left.value==c.value&&!c.left.touched){
      Cell.search(c.left);
    }
    if(c.right!=null&&c.right.value==c.value&&!c.right.touched){
      Cell.search(c.right);
    }
    return c.size;
  }
}