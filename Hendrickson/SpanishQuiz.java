import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class SpanishQuiz{
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(new File("spanishquiz.dat"));
    int caseN = scan.nextInt();scan.nextLine();
    ArrayList<String> city = new ArrayList<String>();
    ArrayList<String> country = new ArrayList<String>();
    city.add("Mexico D.F.");
    country.add("Mexico");
    city.add("Guatemala");
    country.add("Guatemala");
    city.add("Tegucigalpa");
    country.add("Hounduras");
    city.add("San Salvador");
    country.add("El Salvador");
    city.add("Managua");
    country.add("Nicaragua");
    city.add("San Jose");
    country.add("Costa Rica");
    city.add("Panama");
    country.add("Panama");
    city.add("Caracas"); 
    country.add("Venzuela");
    city.add("Bogota");
    country.add("Colombia");
    city.add("Quito");
    country.add("Ecuador");
    city.add("Lima");
    country.add("Peru");
    city.add("La Paz");
    country.add("Bolivia");
    city.add("Asuncion");
    country.add("Paraguay");
    city.add("Santiago");
    country.add("Chile");
    city.add("Buenos Aires");
    country.add("Argentina");
    city.add("Montevideo");
    country.add("Uruguay");
    city.add("Brasilia");
    country.add("Brazil");
    while(caseN-- > 0){
      String line = scan.nextLine().trim();
      args = line.split(" ");
      if(args[0].equals("What")){
        for(int i=0;i<city.size();i++){
          if(args[args.length-1].substring(0,args[args.length-1].length()-1).equals(country.get(i)))
            out.println(city.get(i) + " is the capital city of " + country.get(i) +".");
        }
      }
      else{
        for(int i=0;i<city.size();i++)
          if(args[0].equals(city.get(i)))
            out.println(city.get(i) + " is the capital city of " + country.get(i) +".");
      }
    }
  }
}