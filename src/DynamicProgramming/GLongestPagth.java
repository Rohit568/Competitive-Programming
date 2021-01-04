package DynamicProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class GLongestPagth {
	static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static int dp[] = new int[10000000];
    static boolean vis[] = new boolean[10000000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				int m = sc.nextInt();
		
		
		for(int i=0; i<=n; i++)  list.add(new ArrayList());
		for(int i = 0; i<m; i++)
		{
			int a  = sc.nextInt();
			int b = sc.nextInt();
			addEdge(a, b);
		}
		
		int ans = 0;
		for(int i=1; i<=n; i++)
		{
			ans = Math.max(solve(i), ans);
		}
		
		System.out.println(ans);

	}
	public static void addEdge(int a ,int b)
	{
		list.get(a).add(b);
	}
	public static int solve(int x)
	{
		if(vis[x] == true)
		{
			return dp[x];
		}else
		{   int ans = 0;
		    vis[x] = true;
		    for(int i : list.get(x))
		    {
		    	ans = Math.max(1+solve(i), ans);
		    }
		   
		    dp[x] = ans;
		    return ans;	
		}
	}

}
