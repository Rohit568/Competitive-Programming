package Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class TopologicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		int n = sc.nextInt();
		int e = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			graph.add(new ArrayList());
		}
		
		for(int i=0;i<e; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		
		boolean vis[] = new boolean[n+1];
		Stack<Integer> stack  = new Stack<>();
		
		for(int i=0; i<n; i++)
		{
			if(vis[i]!=true)
			{
				dfs(graph, vis, stack, i);
			}
		}
		
		for(int i : stack)
		{
			System.out.print(i+"->");
		}
	    

	}

	private static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] vis, Stack<Integer> stack, int i) {
		// TODO Auto-generated method stub
		vis[i] = true;
		
		for(int f :graph.get(i))
		{
			if(vis[f]!=true)
			 dfs(graph, vis, stack, f);
		}
		stack.push(i);
	}

	

}
