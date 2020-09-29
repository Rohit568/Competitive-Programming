package DynamicProgramming;

import java.util.Scanner;

public class RemoveRectangle {
	
	public static int solve(int n, int dp[])
	{
		//System.out.println(n);
		if(n> 0 && n<10)
			return 1;
		
		if(dp[n] !=0)
			return dp[n];
		
		String str = Integer.toString(n);
		//System.out.println(str);
		int res = Integer.MAX_VALUE;
		for(int i=0;i<str.length(); i++)
		{
			if(str.charAt(i) != '0') {
			 int intval = n - Character.getNumericValue(str.charAt(i));
			 //System.out.print(intval + " ..");
			 res = 1 + Math.min(res, solve(intval, dp));
			// System.out.println(res);
		    }
		}
		dp[n] = res;
		
		return res;
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int dp[] = new int[n+1];
		int result = solve(n, dp);
		
		System.out.println(result);

	}

}
