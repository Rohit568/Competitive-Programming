package DynamicProgramming;

import java.util.Scanner;

public class DiceCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		long mod = (int)Math.pow(10, 9) + 7;
		long dp[] = new long[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++)
		{
			for(int j = 1; j<=6; j++)
			{
				if(j > i)
					continue;
				else
				{
					dp[i] = (dp[i]%mod + dp[i-j]%mod)%mod;
				}
			}
		}
	
		System.out.println(dp[n]);
		
		
		
	}

}
