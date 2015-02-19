import java.util.*;

public class PasswordGenerator
{
    public static void main(String[] args)
    {
    	Random RanGen = new Random();

		String answer ="";
		char get = ' ';
		int randomNumber = 0;
		int thing = 0;
		System.out.println("Welcome to Password Generator!");

    	final String ALL_SYMBOLS = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*()-_=+\\|][{}\"';:?//>.<,";
    	String lowerCase = ALL_SYMBOLS.substring(0, 26);
		String upperCase = ALL_SYMBOLS.substring(26, 52);
		String numbers = ALL_SYMBOLS.substring(52, 62);
		String symbols = ALL_SYMBOLS.substring(62, ALL_SYMBOLS.length());

		boolean filled = false;
		boolean noRepeat = true;
		int runs = 0;
		ArrayList<Integer> RandomNoRepeat = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		while(!filled)
		{
			runs = RanGen.nextInt(numberValue)+1;
			for(int p=0; p<list.size();p++)
			{
				if(list.get(p) == runs)
				{
					noRepeat = false;
					break;
				}
			}
			list.add(runs);
			if(noRepeat == true)
			{
				RandomNoRepeat.add(runs);
			}
			if(RandomNoRepeat.size() == 52)
			{
				filled = true;
			}
			noRepeat = true;
		}

    	int randomSize = RanGen.nextInt(15)+1;
    	if(randomSize < 8)
    	{
    		int dumb = 8 - randomSize;
    		randomSize += dumb;
    	}

    	for(int i=0;i<randomSize;i++)
    	{

			thing = RanGen.nextInt(randomSize)+1;
			if(thing > randomSize-3)
			{
				int moreThing = thing - (randomSize-3);
				thing  = thing - moreThing;
			}
			for(int a =0; a<thing; a++)
			{
				for(int p =0; p< RandomNoRepeat)
				{
					randomNumber = RanGen.nextInt(lowerCase.length());
					if(RandomNoRepeat.get(0) == 1)
					{
						get = lowerCase.charAt(randomNumber);
					}
					else if(RandomNoRepeat.get(0) == 2)
					{
						get = upperCase.charAt(randomNumber);
					}
					else if(RandomNoRepeat.get(0) == 3)
					{
						get = numbers.charAt(randomNumber);
					}
					else if(RandomNoRepeat.get(0) == 4)
					{
						get = symbols.charAt(randomNumber);
					}
					answer += Character.toString(get);
				}
			}
			randomSize -= thing;
    		thing = RanGen.nextInt(randomSize)+1;
    		else if(thing > randomSize-2)
    		{
    			int moreThing = thing - (randomSize-2);
				thing  = thing - moreThing;
    		}
    		for(int b =0; b<thing; b++)
			{
				for(int p=0; p<RandomNoR)
				randomNumber = RanGen.nextInt(lowerCase.length());
				if(RandomNoRepeat.get(1) == 1)
				{
					get = lowerCase.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(1) == 2)
				{
					get = upperCase.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(1) == 3)
				{
					get = numbers.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(1) == 4)
				{
					get = symbols.charAt(randomNumber);
				}
				answer += Character.toString(get);
			}
			randomSize -= thing;
    		thing = RanGen.nextInt(randomSize)+1;
			else if(thing > randomSize-1)
    		{
    			int moreThing = thing - (randomSize-1);
				thing  = thing - moreThing;
    		}
    		for(int c =0; c<thing; c++)
			{
				randomNumber = RanGen.nextInt(lowerCase.length());
				if(RandomNoRepeat.get(2) == 1)
				{
					get = lowerCase.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(2) == 2)
				{
					get = upperCase.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(2) == 3)
				{
					get = numbers.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(2) == 4)
				{
					get = symbols.charAt(randomNumber);
				}
				answer += Character.toString(get);
			}
    		randomSize -= thing;
    		thing = RanGen.nextInt(randomSize)+1;
    		else if(thing == randomSize)
    		{
    			int moreThing = thing - (randomSize-1);
				thing  = thing - moreThing;
    		}
    		for(int c =0; c<thing; c++)
			{
				randomNumber = RanGen.nextInt(lowerCase.length());
				if(RandomNoRepeat.get(2) == 1)
				{
					get = lowerCase.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(2) == 2)
				{
					get = upperCase.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(2) == 3)
				{
					get = numbers.charAt(randomNumber);
				}
				else if(RandomNoRepeat.get(2) == 4)
				{
					get = symbols.charAt(randomNumber);
				}
				answer += Character.toString(get);
			}
    	}

    	for(int i=0; i<answer.length(); i++)
    	{
    		for(int p = 0; p<26; p++)
    		{
    			if(ALL_SYMBOLS.charAt(p) == answer.charAt(i))
    			{
    				lowerCase = true;
    			}
    			else if(ALL_SYMBOLS.charAt(p+26) == answer.charAt(i))
    			{
    				upperCase = true;
    			}
    		}
    		for(int q = 0; q< 11; q++)
    		{
    			if(ALL_SYMBOLS.charAt(q+52) == answer.charAt(i))
    			{
    				numbers = true;
    			}
    		}
    		for(int e = 62; e<ALL_SYMBOLS.length(); e++)
    		{
    			if(ALL_SYMBOLS.charAt(e) == answer.charAt(i))
    			{
    				symbols = true;
    			}
    		}
    	}
    	System.out.println(answer);
    }
}
