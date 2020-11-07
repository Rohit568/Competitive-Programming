package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class TopSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
		
		for(int i =0 ;i<v; i++)
		{
			list.add(new ArrayList<>());
		}
		
		int e = sc.nextInt();
		
		for(int i =0; i<e; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			addEdge(list, a, b);
			
		}
		
		boolean vis[] = new boolean[v+1];
		
		int ordering[]  = new int[v+1];
		
		int i = v-1;
		
		
		for(int at = 0; at< v; i++)
		{
			if(vis[at] != true)
			{
				ArrayList<Integer> visitednode = new ArrayList<>();
				dfs(at, vis, visitednode, list );
				
				for(int c : visitednode) {
					ordering[i] = c;
					i = i-1;
				}
			}
		}

	}

	private static void dfs(int at, boolean[] vis, ArrayList<Integer> visitednode, ArrayList<ArrayList<Integer>> list) {
		// TODO Auto-generated method stub
		
		vis[at] = true;
		
		for(int i : list.get(at))
		{
			if(vis[i] != true);
			dfs(at, vis , visitednode, list);
		}
		
		visitednode.add(at);
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> list, int a, int b) {
		// TODO Auto-generated method stub
		list.get(a).add(b);
		
	}

}
