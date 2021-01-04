package cses;

import java.util.Scanner;

public class CoinsCombination2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int x = sc.nextInt();
		int coins[] = new int[n];
		for(int i=0; i<n; i++)
			coins[i] = sc.nextInt();
		
		int dp[] = new int[x + 1];
		dp[0] = 1;
		for(int i=0; i<n; i++)
		{
			for(int j = 1; j <= x; j++)
			{
				
				if(j%coins[i] == 0)
						dp[j] = 1 + dp[j];
				else if(j > coins[i])
				{
					if((j- coins[i]) == 0)
					dp[j] = 1 + dp[j - coins[i]];
				}
			}
		}
		for(int i : dp)
		System.out.print(i+" ");
	}

}
