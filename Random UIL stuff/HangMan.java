import java.util.*;

public class HangMan
{
    public static void main(String[] args)
    {
    	Scanner read = new Scanner(System.in);
    	Random ran = new Random();

    	String[]words = {"coffee", "soup", "dog", "cat", "bear", "house", "table", "desk"};

		int wordPos =  ran.nextInt(words.length);

		String word = words[wordPos];
		char[]letters = new char[word.length()];

		System.out.println("HELLO WELCOME TO HANGMAN! GUESS LETTERS!");
		System.out.println(Arrays.toString(letters));

		String answer = "";

		int wrong = 0;
		int help =0;

		while(wrong != 5)
		{
			help =0;
			String reader =read.next();
			char input = reader.charAt(0);

			for(int p=0; p<word.length(); p++)
			{
				if(word.charAt(p) == input)
				{
					help++;
					letters[p] = input;
					System.out.println(Arrays.toString(letters));

					for(int q=0; q<letters.length; q++)
					{
						if(letters[q] == word.charAt(q))
						{
							answer += Character.toString(letters[q]);
						}
					}
					if(answer.equals(word))
					{
						System.out.println("YOU WIN!!! WHAT A BOSS!!!");
						System.out.println("YOU got " + wrong + " wrong");
						break;
					}
					answer ="";
				}
				else if(p == word.length()-1 && help == 0)
				{
					System.out.println("wrong");
					wrong++;
				}
			}
			if(answer.equals(word))
			{
				break;
			}
			else if(wrong == 5)
			{
				System.out.println("You LOSE!!!!! LOSER GO KILL YOURSELF");
				break;
			}
		}
	}
}
