package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class KosaRajuAlgorithm{
	int timer = 0;

	public static void dfs(ArrayList<ArrayList<Integer>> g, boolean vis[], int i,Stack<Integer> s)
	{
		vis[i] = true;
		for(int j: g.get(i))
		{
			if(vis[j]!=true)
			{
				dfs(g, vis, j, s);
			}
		}
		s.push(i);
	}
	
	public static ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>> g)
	{
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i= 0; i<5; i++) graph.add(new ArrayList());
		
		for(int i=0; i<g.size(); i++)
		{
			for(int j: g.get(i))
			{
				graph.get(j).add(i);
			}
		}
		
		return graph;
		
		
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		 ArrayList<ArrayList<Integer>>  graph  =  new ArrayList<>();
		 
		 for(int i=0; i<5; i++)
			 graph.add(new ArrayList<>());
		 
		 graph.get(0).add(1);
		 graph.get(1).add(2);
		 graph.get(2).add(0);
		 graph.get(1).add(3);
		 graph.get(3).add(4);
		 
		 
		 Stack<Integer> stack = new Stack<>();
		 boolean vis[] = new boolean[5];
		 
		 dfs(graph, vis, 0, stack);
		 
		 graph = reverse(graph);
		 
		 boolean v[] = new boolean[6];
		 int count = 0;
		 while(!stack.isEmpty()) {
			 int t = stack.pop();
			 if(v[t] != true) {
				 countDfs(graph, v, t);
				 count++;
				 System.out.println();
			 }
		 }
			 
		
		 
		 
	}
	
	public static void countDfs(ArrayList<ArrayList<Integer>> g, boolean vis[], int i)
	{
		vis[i] = true;
		System.out.print(i);
		
		for(int j: g.get(i))
		{
			if(vis[j] != true)
			{
				countDfs(g, vis, j);
			}
		}
		
		
	}

}
