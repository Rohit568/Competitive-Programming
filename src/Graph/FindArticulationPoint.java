package Graph;

import java.util.ArrayList;
import java.util.Arrays;

class Graph{
	ArrayList<ArrayList<Integer>>  arr;
	Graph(int v)
	{
		for(int i=0; i<v; i++)
			arr.add(new ArrayList());
	}
	
}
public class FindArticulationPoint {
	static int timer = 0;
	
	public static void addEdge(Graph g, int u, int v)
	{
		g.arr.get(u).add(v);
		g.arr.get(v).add(u);
	}
    public static void disdfs(Graph g, int dis[], int i)
    {
    	dis[i] = ++timer;
    	for(int child: g.arr.get(i))
    	{
    		if(dis[child]!=0)
    			disdfs(g, dis, child);
    	}
    }
    
    public static void lowdfs(Graph g, int low[], int i, int dis[], boolean vis[])
    {
        vis[i] = true;
        int ans = Integer.MAX_VALUE;
        
        for(int  child : g.arr.get(i))
        {
        	if(vis[child] == false)
        	{
        		if(dis[child] < ans)
        			
        	}
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
		
		int low[] = new int[5];
		int dis[] = new int[5];
		
		boolean vis[] = new boolean[5+1];
		disdfs(g, dis, 0);
		for(int i=0; i<5; i++)
		{
			Arrays.fill(vis, false);
		    lowdfs(g, low, i, dis, vis);
		}
		
	}

}
