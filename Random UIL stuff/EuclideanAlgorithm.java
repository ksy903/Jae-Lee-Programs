import java.util.*;

class EuclideanAlgorithm{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("please type in two numbers to find the GCD of");
		int a = scan.nextInt();
		int b = scan.nextInt();
		EuclideanAlgorithm EA = new EuclideanAlgorithm();
		System.out.println(EA.gcd(a, b));
	}
	int gcd(int a, int b){
		int ans = 0;
		int mod = 0;
		if(a == 0)
			return b;
		else if(b==0)
			return a;
		else
		if(a > b){
			mod = a%b;
			ans = gcd(mod, b);
			return ans;
		}
		else if(b > a){
			mod = b%a;
			ans = gcd(a, mod);
			return ans;
		}
		else
			return a;
	}
}