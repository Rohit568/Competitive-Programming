package DynamicProgramming;

import java.util.*;
import java.io.*;
 
 
class Knapsack1{
  public static void main(String args[]) throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String str1[] = reader.readLine().split(" ");
    int N = Integer.parseInt(str1[0]);
    int cap = Integer.parseInt(str1[1]);
    int w[] = new int[N];
    int v[] = new int[N];
    for(int i=0; i<N; i++)
    {
      String str[] = reader.readLine().split(" ");
      w[i] = Integer.parseInt(str[0]);
      v[i] = Integer.parseInt(str[1]);
    }
    
    int res = Solution(w, v, N, cap);
    
    System.out.println(res);
  }
  
  public static int Solution(int w[], int v[], int N, int cap)
  {
    
    
    int dp[][] = new int[N+1][cap + 1];
    
    for(int i=0; i<=N; i++)
    {
      for(int j = 0; j<=cap; j++)
      {
         if(i==0 ||j==0)
           dp[i][j] = 0;
         else
         {
             if( j+w[i]<=cap)
                dp[i][j] = Math.max(dp[i-1][j], v[i] + dp[i-1][j-w[i-1]]);
              else
                 dp[i][j] = dp[i-1][j];
                                                               
        }                                                            
     }                                                      
                                                               
   }
       return dp[N][cap];
  }  
}