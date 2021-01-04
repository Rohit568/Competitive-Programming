package cses;
import java.io.*;
import java.util.*;
public class BuildingRoads {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(bf.readLine());
		String str[] = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int e = Integer.parseInt(str[1]);
		
		ArrayList<ArrayList<Integer>>  graph = new ArrayList<>();
		//ArrayList<ArrayList<Integer>>  ans = new ArrayList<>();
		
		for(int i=0; i<=n; i++)
		{
			graph.add(new ArrayList<>());
			
		}
		
		for(int i=0; i<e;  i++)
		{
			String str1[] = bf.readLine().split(" ");
			int a = Integer.parseInt(str1[0]);
			int b = Integer.parseInt(str1[1]);
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
	    int count = 0;
	    int cc  = 0;
	    ArrayList<Integer> lead = new ArrayList<>();
	    int vis[] = new int[n+1];
		for(int i = 1; i<=n; i++)
		{
			
			if(vis[i] != 1)
			{
				cc++;
				lead.add(i);
				dfs(graph, vis, i);
				
			}
		}
		
		System.out.println(cc-1);
		if(cc > 1)
		{
			int u = lead.get(0);
			
			for(int i=1; i<cc; i++)
			{
				int v = lead.get(i);
				
				System.out.println(u + " " + v);
				u = v;
			}
			
			
		}

	}
	
	public static void dfs(ArrayList<ArrayList<Integer>> graph,  int vis[], int i)
	{
		vis[i] = 1;
		for(int a : graph.get(i))
		{
			if(vis[a] != 1)
			   dfs(graph, vis, a);
		}
		
	}

}
