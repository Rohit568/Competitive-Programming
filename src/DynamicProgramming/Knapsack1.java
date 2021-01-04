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
    
    long res = Solution(w, v, N, cap);
    
    System.out.println(res);
  }
  
  public static long Solution(int w[], int v[], int N, int cap)
  {
    
    
    HashMap<String, Long>  dp = new HashMap<>();
    
    for(int i=0; i<=N; i++)
    {
      for(int j = 0; j<=cap; j++)
      {
         if(i==0 ||j==0)
           dp.put(i+"|"+j, (long)0 );
         else if( w[i-1]<=j) {
               long ans = Math.max(dp.get((i-1)+"|"+j), v[i-1] + dp.get((i-1)+"|"+(j-w[i-1])));
               
               dp.put(i+"|"+j, ans);
         }
              else
            	  dp.put(i+"|"+j, dp.get(i-1+"|"+j));
                                                               
                                                                    
     }                                                      
                                                               
   }
       return dp.get(N+"|"+cap);
  }  
}