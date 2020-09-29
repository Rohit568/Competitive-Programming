package contests;

import java.util.*;
import java.io.*;


class Kittytree{

    public static int[][] solve(int cost[][] ,int n)
    {
        int dp[][] = cost.clone();

        boolean isFilled = false;

        for(int i =1; i<=n; i++)
        {
            while(!isFilled){
             for(int j=1; j<=n; j++)
             {
                 for(int k =1 ; k<=n; k++)
                 {
                       if(dp[j][i] > dp[j][k] + cost[k][j])
                       {
                           dp[j][i] = dp[j][k] + cost[k][j];
                           isFilled = false;
                       }
                 }
             }
            }
        }
       
        return dp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        // ArrayList<ArrayList<Integer>> tree = new ArrayList<>();

        // for(int i=0; i<=n; i++)
        // tree.add(new ArrayList());
        // for(int i=1; i<n; i++)
        // {
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();

        //     addEdge(tree, a, b);
        // }
         int m = (int)Math.pow(10, 9) + 7;
        // int dist[] = new int[n+1];
        // int pred[] = new int[n+1];

        // int ans = 0;
        
        int cost[][] = new int[n+1][n+1];

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==j)
                {
                    cost[i][j] = 0;
                }
                else
                {
                    cost[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while(n-->1)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            cost[a][b] = 1;
            cost[b][a] = 1;
        }

        int dp[][] = solve(cost, n);

         for(int i=1; i<=n; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        while(q-->0)
        {
            int ans = 0;
            int t = sc.nextInt(); 
            int arr[] = new int[t];
            for(int i=0; i<t; i++) {
                arr[i] = sc.nextInt();
                //System.out.println(arr[i]);
            }
            if(t == 1)
            System.out.println(0);
            else
            {
            for(int i=0; i<t-1; i++)
            {
                for(int j = i+1; j<t; j++)
                {
                      int dis = dp[arr[i]][arr[j]];

                      ans = ans  +  (((arr[i] * arr[j]) %m ) * dis%m)%m;
                     // System.out.println(ans + "    " +dis);
                }
            } 
            
            System.out.println(ans);
            }
        }


    }
}
