import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class MMM{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("mmm.dat"));
    while(scan.hasNext()){
      String[] words = scan.nextLine().trim().split(" ");
      ArrayList<Double> nums = new ArrayList<Double>();
      int index = 0;
      double max = 0, mean = 0, median = 0, mode = 0;
      for(String s:words){
        double d = (double)Double.parseDouble(words[index]);
        max += d;
        nums.add(d);
        index++;
      }
      mean = max / nums.size();
      Collections.sort(nums);
      if(nums.size() % 2 == 0){
        median = (nums.get(nums.size() / 2) + nums.get(nums.size() / 2 - 1)) / 2;
      }
      else{
        median = nums.get(nums.size() / 2 + 1);
      }
      int[] times = new int[nums.size()];
      for(int r = 0; r<nums.size(); r++){
        for(int c = 0; c<nums.size(); c++){
          if(r != c && (double)nums.get(r) == (double)nums.get(c)){
            times[r]++;
          }
        }
      }
      int maxs = -1;
      int pos = 0;
      for(int i=0;i<times.length;i++){
        if(times[i] > maxs){
          maxs = times[i];pos = i;
        }
      }
      mode = nums.get(pos);
      out.printf("%.2f %.2f %.2f %.2f%n", mean, median, mode, ((mean + median + mode)/3));
    }
  }
}