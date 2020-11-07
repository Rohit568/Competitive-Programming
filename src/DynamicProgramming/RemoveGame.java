package DynamicProgramming;

import java.util.Scanner;

public class RemoveGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long arr[] = new long[n];
		
		for(int i=0; i<n; i++) arr[i] = sc.nextLong();
		
		boolean sw = false;
		long dp[][] = new long[n+1][n+1];
		long ans = letsSolve(arr, 0, n-1, dp);
		
		System.out.println(ans);
		
		

	}
	
	public static long letsSolve(long arr[], int i, int j, long dp[][])
	{
		if(i==j)
			return arr[i];
		if(i + 1 == j)
			return Math.max(arr[i], arr[j]);
		
		if(dp[i][j] != 0)
			return dp[i][j];
		
		long vi = 0;
		long v2 = 0;
		
		vi = arr[i] + Math.min(letsSolve(arr, i+2, j, dp), letsSolve(arr, i+1, j-1, dp));
		v2 = arr[j] + Math.min(letsSolve(arr, i+1, j-1, dp), letsSolve(arr, i, j-2, dp));
		
		dp[i][j] = Math.max(vi, v2);
		
		return Math.max(vi, v2);
		
	}

}
