import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class fate{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("fate.dat"));
    while(scan.hasNext()){
      String line = scan.nextLine().trim();
      String[] words = line.split(" ");
      char[] let = new char[words.length];
      for(int i=0;i<words.length;i++)let[i] = words[i].charAt(0);
      int zeroes = let.length;
      while(zeroes < (let.length - 5)){
        let = remove(let);
        out.println("ASDFASDFAS");
        for(char c:let)
          if(c == '0')
            zeroes++;
      }
      ArrayList<Character> ans = new ArrayList<Character>();
      for(char plz:let)ans.add(plz);
      out.println(ans);
    }
  }
  static char[] remove(char[] d){
    int[] times = new int[d.length];
    int[] value = new int[d.length];
    for(int r = 0; r<d.length;r++){
      for(int c = 0; c<d.length;c++){
        if(r!=c&&d[r]==d[c]&&Character.isLetter(d[r]))
          times[r]++;
        if(d[r]=='A')value[r] = 1;
        if(d[r]=='B')value[r] = 2;
        if(d[r]=='C')value[r] = 3;
        if(d[r]=='D')value[r] = 4;
        if(d[r]=='E')value[r] = 5;
      }
    }
    out.println(Arrays.toString(value));
    out.println(Arrays.toString(times));
    int min = Integer.MIN_VALUE, pos = -1;
    char less = ' ';
    for(int r=0;r<d.length;r++){
      if(times[r]==0&&d[r] < min&&Character.isLetter(d[r]))
        min = d[r];pos=r;
    }
    if(pos == -1){
      for(int r=0;r<d.length;r++){
        if(d[r] < min && Character.isLetter(d[r]))
          less = d[r];
      }
      for(int c=0;c<d.length;c++){
        if(d[c] == less)
          d[c] = 0;
      }
    }
    else{
      d[pos] = 0;
    }
    return d;
  }
}