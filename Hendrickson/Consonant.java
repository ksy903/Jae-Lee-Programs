import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Consonant{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("consonant.dat"));
    int caseN = scan.nextInt();scan.nextLine();
    String vowel = "aeiou";
    while(caseN-- > 0){
      String line = scan.nextLine().replace(" ", "");
      ArrayList<String> upList = new ArrayList<String>();
      ArrayList<String> downList = new ArrayList<String>();
      int currentValue = -1;
      String builder = "";
      for(int i=0;i<line.length();i++){  
        if(Character.isLetter(line.charAt(i))){
          boolean notVowel = true;
          for(int r=0;r<vowel.length();r++){
            if(line.substring(i, i+1).toLowerCase().equals(vowel.substring(r, r+1)))
              notVowel = false;
          }
          if(notVowel && line.charAt(i) >= currentValue){
            builder += line.charAt(i);
            currentValue = line.charAt(i);
          }
          else if(builder.length() > 0 && notVowel){
            upList.add(builder);
            builder = "";
            builder += line.charAt(i);
            currentValue = -1;
          }
        }
      }
      upList.add(builder);
      builder ="";
      currentValue = -1;
      for(int i=line.length()-1;i>=0;i--){  
        if(Character.isLetter(line.charAt(i))){
          boolean notVowel = true;
          for(int r=0;r<vowel.length();r++){
            if(line.substring(i, i+1).toLowerCase().equals(vowel.substring(r, r+1)))
              notVowel = false;
          }
          if(notVowel && line.charAt(i) >= currentValue){
            builder += line.charAt(i);
            currentValue = line.charAt(i);
          }
          else if(builder.length() > 0 && notVowel){
            downList.add(builder);
            builder = "";
            builder += line.charAt(i);
            currentValue = -1;
          }
        }
      }
      upList.add(builder);
      builder ="";
      currentValue = -1;
      int Biggest = -5;
      for(String s:upList)
        if(s.length() > Biggest)
          Biggest = s.length();
      for(String s:downList)
        if(s.length() > Biggest)
          Biggest = s.length();
      out.println(Biggest);
    }
  }
}
               