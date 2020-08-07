package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CountSteptomake1primetootherprime {
	
	static boolean isPrime[] = new boolean[10000];
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void primerySeive()
	{
		isPrime[0] = false;
		isPrime[1] = false;
		
		Arrays.fill(isPrime, true);
		for(int i = 2; i*i<10000; i++)
		{
			 if(isPrime[i] == true)
			 {
				 for(int j = i*i; j<10000; j+=i)
				 {
					 isPrime[j] = false;
				 }
			 }
		}
	}
	
	public static boolean isValid(int a , int b)
	{
		int count = 0;
		while(a!=0)
		{
			int m= a%10;
			int s = b%10;
			
			if(m!=s)
				count++;
			a = a/10;
			b = b/10;
		}
		
		if(count==1)
			return true;
		else
			return false;
	}
	
	
	public static void makeGraph()
	{
		for(int i=0; i<10000; i++)
			graph.add(new ArrayList<>());
		
		for(int i=1000; i<10000; i++)
		{
			for(int j = i+1; j<10000; j++)
			{
				if(isPrime[i] == true && isPrime[j] == true && isValid(i, j))
				{
			       graph.get(i).add(j);
			       graph.get(j).add(i);
				}
			}
		}	
	}
	 
	 public static int BFS(int src, int des)
	 {
		 Queue<Integer> q = new LinkedList<>();
		 boolean []vis = new boolean[10000];
		 
		 for(int i=0; i<10000; i++)
			 vis[i] = false;
		 int dist[] = new int[10000];
		 q.add(src);
		 dist[src] = 0;
		 vis[src] = true;
		 
		 while(!q.isEmpty())
		 {
			 int curr = q.remove();
			 for(int child: graph.get(curr))
			 {
				 if(vis[child]!=true)
				 {
					 vis[child] = true;
					 dist[child] = dist[curr] + 1;
					 q.add(child);	 
				 }
			 }
		 }
		 return dist[des];  
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primerySeive();
		makeGraph();
		System.out.println(BFS(1033, 8179));
	}

}
