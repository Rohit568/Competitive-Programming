package NumberTheory;

import java.util.Scanner;

public class LargeNumberGCD {
	
	
	public static int gcd(int a, int b)
	{
		if(a < b)
			gcd(b, a);
		if(b == 0)
			return a;
		return gcd(b, a%b);
		
	}
	public static int calculateGCD(String a, int b)
	{
		int ans = 0;
		for(int i=0; i<a.length(); i++)
		{
			ans = ((ans * 10)%b + Integer.parseInt(a.substring(i, i+1)))%b;
		}
		
		return gcd(b, ans);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a  = sc.nextLine();
		int b = sc.nextInt();
	    System.out.println(calculateGCD(a, b));
	}

}
