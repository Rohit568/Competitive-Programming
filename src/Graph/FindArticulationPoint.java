package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

class Graph{
	
	LinkedList<Integer> adj[];
	Graph(int v)
	{
		adj = new LinkedList[v+1];
		for(int i=0; i<v; i++)
			adj[i] = new LinkedList<>();
	}
}

class FindArticulationPoint{
	static int time = 0;
	public static void addEdge(Graph g, int src, int des)
	{
		g.adj[src].add(des);
		g.adj[des].add(src);
	}
	
	public static void solve(Graph g, int u, boolean vis[], int par[], int low[], int dis[], boolean ap[]) {
		
		vis[u] = true;
		low[u] = dis[u] = ++time;
		
		int children = 0;
		
		Iterator<Integer> itr = g.adj[u].iterator();
		
		while(itr.hasNext())
		{
			int v = itr.next();
			
			if(!vis[v])
			{
				children++;
				par[v] = u;
				solve(g, v, vis, par, low, dis, ap);
				low[u] = Math.min(low[u], low[v]);
				
				
				if(par[u] == -1 && children>1)
					ap[u] = true;
				if(par[u] !=-1 && low[v] >=dis[u])
					ap[u] = true;
				
				
			}
			else if(v != par[u])
			{
			    low[u] = Math.min(low[u], dis[v]);	
			}
		}
		
	}
	
	public static void AP(Graph g)
	{
		boolean vis[] = new boolean[6];
		int par[] = new int[6];
		int low[] = new int[6];
		int dis[] = new int[6];
		boolean ap[] = new boolean[6];
			
		for(int i=0; i<6; i++)
		{
			par[i] = -1;
			ap[i] = false;
			vis[i] = false;
		}
		
		for(int i=0; i<5; i++)
			if(vis[i]!=true)
		solve(g, 0, vis, par, low, dis, ap);
		
		for(int i=0; i<5; i++)
		{
			if(ap[i] == true)
				System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 5;
		Graph g = new Graph(s);
		
		addEdge(g, 0, 1);
		addEdge(g, 0, 2);
		addEdge(g, 1, 2);
		addEdge(g, 2, 3);
		addEdge(g, 2, 4);
		addEdge(g, 3, 4);
		
		AP(g);
	}
}
