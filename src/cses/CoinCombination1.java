package cses;

import java.util.*;
import java.io.*;

public class CoinCombination1 {
	
	public static void main(String[] args) throws IOException
	{
	     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	     int mod = (int)(Math.pow(10, 9) + 7);
	     String str[] = bf.readLine().split(" ");
	     int n = Integer.parseInt(str[0]);
	     int x= Integer.parseInt(str[1]);
	     String str1[] = bf.readLine().split(" ");
	     int coin[] = new int[n];
	     for(int i=0; i<n; i++)
	    	 coin[i] = Integer.parseInt(str1[i]);
	     int dp[] = new int[x + 1];
	     dp[0] = 1;
	     for(int i=1; i<=x; i++)
	     {
	    	 for(int j = 0; j<n ; j++)
	    	 {
	    		 if(coin[j] > i)
	    			 continue;
	    		 else
	    		 {
	    			 dp[i] = (dp[i] + dp[i-coin[j]])%mod;
	    		 }
	    	 }
	     }
	     System.out.println(dp[x]);
	   	
}
}
