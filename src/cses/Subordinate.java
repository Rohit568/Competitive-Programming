package cses;
import java.util.*;
import java.io.*;
public class Subordinate {
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String str[] = bf.readLine().split(" ");
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		for(int i=0; i<=n; i++)
			graph.add(new ArrayList<>());
		int ans[] = new int[n+1];
		int j =0;
		for(int i = 2; i<=n; i++)
		{
			int a = Integer.parseInt(str[j++]);
			graph.get(a).add(i);
			graph.get(i).add(a);
		}
		
		solve( graph, 1, 0, ans);
		
		for(int i = 1 ;i<=n; i++)
			System.out.print(ans[i] + " ");
	    
	}
	
	public static void solve(ArrayList<ArrayList<Integer>> graph, int src, int par, int ans[])
	{
		int subordinate = 0;
		
		for(int child : graph.get(src))
		{
              if(child != par)
              {
            	  solve(graph, child , src , ans);
            	  subordinate += (1 + ans[child]);
              }
		
		}
		ans[src] = subordinate;
	}

}


