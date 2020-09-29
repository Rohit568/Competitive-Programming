package contests;

import java.util.Scanner;

public class BHarryPotterMagicBook 
{
	public static int solve(String s)
	{
		if(s.length() == 1)
			return 0;
		int sum = 0;
		
		for(int i=0; i<s.length(); i++)
			sum = sum + Integer.parseInt(s.charAt(i)+"");
		
		String str = Integer.toString(sum);
		
		return 1 + solve(str);
		
	}
	public static void main(String args[])
	{	
	     Scanner sc = new Scanner(System.in);
	     String str = sc.next();
	     int res = solve(str);
         System.out.println(res);
    }
}
