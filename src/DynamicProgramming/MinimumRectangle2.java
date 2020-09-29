package DynamicProgramming;

import java.util.Scanner;

public class MinimumRectangle2 {
	
	
	public static int solve(int a, int b)
	{
		int dp[][] = new int[a+1][b+1];
		
		
		for(int i=1; i<=a; i++)
		{
			for(int j = 1; j<= b; j++)
			{
				if(i == j)
					dp[i][j] = 0;
				else
				{
					int ans = Integer.MAX_VALUE;
					for(int k = 1; k<i; k++)
					{
						ans=  Math.min(ans, 1 + dp[i-k][j] + dp[k][j]);
					}
					for(int k = 1; k<j; k++)
					{
						ans= Math.min( ans, 1 + dp[i][j-k] + dp[i][k]);
					}
					
					dp[i][j] =  ans;
				}
				
			}
			
		}
		return dp[a][b];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(solve(r, c));
		

	}

}
