package Graph;

import java.util.*;

public class MinimumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	  Scanner sc = new Scanner(System.in);
      
	  
	  int test = sc.nextInt();
	  
	  while(test-->0)
	  {
		  int n = sc.nextInt();
		  int arr[] = new int[n+1];
		  for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
		  
		  ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		  for(int i=0; i<=n;i++)
			  graph.add(new ArrayList());
		  
		  for(int i=1; i<=n; i++) {
			  addEdge(graph, arr[i], i);
		  }
		  
		  
		  boolean vis[] = new boolean[n+1];
		  int count = 0;
		  
		  for(int i=1; i<=n; i++) {
			  if(vis[i]!=true && arr[i] != i)
			  {
				  dfs(graph, i, vis);
				  count++;
			  }
		  }
		  
		  System.out.println(count);
	  }
	  
	  
	}

	private static void dfs(ArrayList<ArrayList<Integer>> graph, int i, boolean[] vis) {
		// TODO Auto-generated method stub
		
		vis[i] = true;
		
		for(int a : graph.get(i))
		{
			if(vis[a] != true)
				dfs(graph, a, vis);
		}
		
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> graph, int i, int i2) {
		// TODO Auto-generated method stub
		
		graph.get(i).add(i2);
		
	}

}
