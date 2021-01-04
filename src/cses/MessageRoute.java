package cses;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class MessageRoute {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = bf.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		for(int i=0; i<=n; i++)
			graph.add(new ArrayList<>());
		
		for(int i=0; i<m; i++)
		{
			String str1[] = bf.readLine().split(" ");
			int a = Integer.parseInt(str1[0]);
			int b = Integer.parseInt(str1[1]);
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		int vis[] = new int[n+2];
		int par[] = new int[n+2];
		
		par[1] = -1;
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(1);
		int count = 0;
		vis[1] = 1;
		int level[] = new int[n+3];
		level[1] = 1;
		while(!que.isEmpty())
		{
		      int src = que.poll();
		      
		      for(int i : graph.get(src))
		      {
		    	  if(vis[i] != 1)
		    	  {
		    		  vis[i] = 1;
		    		  par[i] = src;
		    		  level[i] = level[par[i]] + 1;
		    		  que.add(i);
		    	  }
		    	  
		    	  if(i==n)
		    	  {
		    		  que.clear();
		    		  break;
		    	  }
		      }
		      
		}
		
		
		if(par[n] != 0)
		{
			System.out.println(level[n]);
			 int pr = n;
			 printn(par, n);
		}
		else
		{
			System.out.println("IMPOSSIBLE");
		}

	}
	
	public static void printn(int par[], int pr)
	{
		if(pr == -1)
			return;
		printn(par, par[pr]);
		System.out.print(pr + " ");
	}
	
	
}
