package DynamicProgramming;

import java.util.*;
import java.io.*;

public class BookShop {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FastReader sc = new FastReader();
		
		int noOfBooks = sc.nextInt();
		int maxPrice = sc.nextInt();
		
		int prices[] = new int[noOfBooks+100];
		int noOfPages[] = new int[noOfBooks+100];
		
		for(int i = 0; i<noOfBooks; i++) prices[i] =  sc.nextInt();
		for(int j = 0; j<noOfBooks; j++) noOfPages[j] = sc.nextInt();
		
		int ans  = solve(prices, noOfPages, noOfBooks, maxPrice);
		System.out.println(ans);
		
	}

	private static int solve(int[] prices, int[] noOfPages, int noOfBooks, int maxPrice) {
		// TODO Auto-generated method stub
		
		int dp[][] = new int[noOfBooks+1][maxPrice+1];
		
		for(int i=0; i<=noOfBooks; i++)
		{
			for(int j = 0; j<=maxPrice; j++)
			{
				if(i==0 || j==0)
					dp[i][j] =0;
				else
				{
					int inc = 0, exc = 0;
					
					if(prices[i-1] <=  j)
					{
						inc = noOfPages[i-1] + dp[i-1][j-prices[i-1]];
					}
					exc = dp[i-1][j];
					
					dp[i][j] = Math.max(inc, exc);
				}
			}
		}
			
		return dp[noOfBooks][maxPrice];
	}

}
