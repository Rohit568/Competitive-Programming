package DynamicProgramming;

import java.util.Scanner;

public class removeDigit2 {

	
	public static int solve(int n)
	{
		int dp[] = new int[n+1];
		
		if(n < 10)
			return 1;
		else {
		    for(int i=1; i<10; i++)
		    {
			dp[i] = 1;
		    }
		
		for(int i = 10; i<=n; i++)
		{
			String str = Integer.toString(i);
			dp[i] = Integer.MAX_VALUE;
			for(int j =0; j<str.length(); j++)
			{
				if(str.charAt(j) != '0')
				{
					int intval = Character.getNumericValue(str.charAt(j));
				
					dp[i] = Math.min(dp[i], 1 + dp[i - intval]);
				}
			}
			
		}
		
		return dp[n];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solve(n));

	}

}
