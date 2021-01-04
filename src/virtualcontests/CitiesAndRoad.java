package virtualcontests;
import java.util.*;
public class CitiesAndRoad {
    static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int m = sc.nextInt();
		
		int cap = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		for(int i=0; i<=n; i++)
			graph.add(new ArrayList<Integer>());
		
		for(int i=0; i<m; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		
		boolean good[] = new boolean[n+1];
		
		dfs(graph, good, cap);
		
		int cnt[] = new int[n+1];
	
		ArrayList<Pair1> pair = new ArrayList<>();
		for(int i= 1; i<n; i++)
		{
			if(good[i] != true)
			{
				count = 0;
				boolean vis[] = new boolean[n+1];
				dfs2(graph, vis, good, i);
				pair.add(new Pair1(count, i));
			}
			
		}
		
	    Collections.sort(pair);
	    int ans = 1;
	    for(Pair1 p : pair)
	    {
	    	if(good[p.second] != true) {
	    	dfs(graph, good, p.second);
	    	ans++;
	    	}
	    }
	    
	    System.out.println(ans);
	    
	    
 }
	private static void dfs2(ArrayList<ArrayList<Integer>> graph, boolean[] vis, boolean good[],int i) {
		// TODO Auto-generated method stub
		vis[i] = true;
		count++;
		for(int to: graph.get(i))
		{
			if(vis[to] !=true && good[to] != true) 
			{
				dfs2(graph, vis, good,to);
			}
		}
	
	}
	private static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] good, int i) {
		// TODO Auto-generated method stub
		good[i] = true;
		for(int to : graph.get(i))
		{
			if(good[to] != true)
				dfs(graph, good , to);
		}
	}
}

class Pair1 implements Comparable<Pair1>{
	int first , second;
	Pair1(int first, int second)
	{
		this.first = first;
		this.second =second;
	}
	
	public int compareTo(Pair1 p)
	{
	   return p.first - this.first;
	}
}
