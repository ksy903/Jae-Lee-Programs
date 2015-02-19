import java.util.*;

public class DecimaltoBinary
{
    public static void main(String[] args)
    {
     	Scanner scan = new Scanner(System.in);

     	System.out.println("Input a decimal Value");
     	double dValue = scan.nextDouble();
	 	int iValue = (int)dValue;
	 	System.out.println(iValue);
	 	double decimal =dValue - iValue;
	 	System.out.println(decimal);
    }
}
