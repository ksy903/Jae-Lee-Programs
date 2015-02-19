import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Rectangle{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("rectangles.dat"));
    int caseN = scan.nextInt();
    while(caseN-- > 0){
      double hor1 = scan.nextDouble();
      scan.nextDouble();
      scan.nextDouble();
      double ver1 = scan.nextDouble();
      scan.nextDouble();
      double ver2 = scan.nextDouble();
      double hor2 = scan.nextDouble();
      scan.nextDouble();
      double x = scan.nextDouble();
      double y = scan.nextDouble();
      if(hor1 == hor2 || ver1 == ver2)
        out.println("NO");
      else{
        //Send by up down left right
        if(hor1 > hor2 && ver1 > ver2)
          search(hor1, hor2, ver2, ver1, x, y);
        if(hor2 > hor1 && ver1 > ver2)
          search(hor2, hor1, ver2, ver1, x, y);
        if(hor1 > hor2 && ver2 > ver1)
          search(hor1, hor2, ver1, ver2, x, y);
        if(hor2 > hor1 && ver2 > ver1)
          search(hor2, hor1, ver1, ver2, x, y);
      }
    }
  }
  static void search(double up, double down, double left, double right, double x, double y){
    if(up > y && down < y && left < x && right > x)
      out.println("YES");
    else
      out.println("NO");
  }
}