import java.util.*;

public class MagicEight
{
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	Random RanGen = new Random();

    	System.out.println("Welcome to Magic Eight Ball! Please write a question.");
    	String question = read.next();

    	ArrayList<String> phrases = new ArrayList<String>();

    	phrases.add("It is certain");
    	phrases.add("It is decidedly so");
    	phrases.add("Without a doubt");
    	phrases.add("Yes definitely");
    	phrases.add("You may rely on it");
    	phrases.add("As I see it, yes");
    	phrases.add("Most likely");
    	phrases.add("Outlook good");
    	phrases.add("Yes");
    	phrases.add("Signs point to yes");
    	phrases.add("Reply hazy try again");
    	phrases.add("Ask again later");
    	phrases.add("Better not tell you now");
    	phrases.add("Cannot predict now");
    	phrases.add("Concetrate and ask again");
    	phrases.add("Don't count on it");
    	phrases.add("My reply is no");
    	phrases.add("My sources say no");
    	phrases.add("Outlook not so good");
    	phrases.add("Very doubtful");

		int ran = RanGen.nextInt(phrases.size());
		System.out.println(phrases.get(ran));
    }
}
