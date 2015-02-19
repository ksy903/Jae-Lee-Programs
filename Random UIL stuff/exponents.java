import java.util.*;

class exponents{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("write base num then exponent value");
		long base = scan.nextLong();
		long exp = scan.nextLong();
		exponents e = new exponents();
		System.out.println(e.calc(base, exp));
	}

	public long calc(long base, long exp){
		long basevalue = 0;
		if(exp == 0)
			return 1;
		else if(exp == 1)
			return base;
		else
		if(exp % 2 == 0)
		{
			basevalue = calc(base, exp/2);
			return basevalue*basevalue;
		}
		else
		{
			basevalue = calc(base, (exp-1)/2);
			return basevalue*basevalue*base;
		}
	}
}