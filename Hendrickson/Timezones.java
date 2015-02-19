import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Timezones{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("timezones.dat"));
    int zones = scan.nextInt();
    int convert = scan.nextInt();
    scan.nextLine();
    Times[] times = new Times[zones];
    for(int i=0;i<zones;i++){
      String line = scan.nextLine();
      String[] words = line.split(" ");
      times[i] = new Times(words[0], (60 * Integer.parseInt(words[1].split(":")[0]) + Integer.parseInt(words[1].split(":")[1])));
    }
    int total = 0;
    while(convert-- > 0){
      String line = scan.nextLine();
      String[] words = line.split("[ =>]+");
      total = (60 * Integer.parseInt(words[0].split(":")[0])) + Integer.parseInt(words[0].split(":")[1]);
      for(int i=0;i<times.length;i++){
        if(times[i].name.equals(words[1])){
          total -= times[i].time;
        }
        if(times[i].name.equals(words[2])){
          total += times[i].time;
        }
      }
      int hour = total / 60;
      String min = String.valueOf(total % 60);
      hour = hour % 24;
      if(min.length() == 1){
        min += "0";
      }
        
        
      out.printf("%s:%s %s\n", hour, min, words[2]);
    }
  }
}
class Times{
  int time;
  String name;
  Times(String s , int i){name = s; time = i;}
}