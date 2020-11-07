package virtualcontests;

import java.util.ArrayList;
import java.util.Scanner;

public class Cycles {
	
	static ArrayList<ArrayList<Integer>> graph;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		graph = new ArrayList<>();
		
		for(int i=0; i<=n; i++)
		{
			graph.add(new ArrayList<>());
		}
		
		for(int i =0; i<m; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			addEdge(a, b);
		}
		int count = 0;
		int vis[] = new int[n+1];
		for(int i=1; i<=n; i++)
		{
			if(vis[i] != 1 && graph.get(i).size() == 2)
			{
				if(dfs(i, i , vis,-1))
				{
					count++;
				}
			}
		}
		
		System.out.println(count);

	}
	
	private static boolean dfs(int src , int dest, int vis[], int par) {
		// TODO Auto-generated method stub
		
		vis[src] = 1;
		
		for(int child : graph.get(src))
		{
			
			if(vis[child]!= 1 && graph.get(child).size() == 2)
			{
				if(dfs(child, dest, vis, src))
					return true;
				else
					return false;
			}
			else if(child != par && child == dest)
				return true;
				
		}
		return false;
	}

	public static void addEdge(int a, int b)
	{
		graph.get(a).add(b);
		graph.get(b).add(a);
	}

}
