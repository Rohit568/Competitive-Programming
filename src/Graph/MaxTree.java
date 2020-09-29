package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxTree {
	
	
    static int s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		String str1[] = sc.nextLine().split(" ");
	    
		int n = Integer.parseInt(str1[0] );
		int k = Integer.parseInt(str1[1]) ;
		s = n;
		
		for(int i=0; i<=n; i++) list.add(new ArrayList());
		
	    for(int i = 1; i<=k; i++)
	    {
	    	int wish = sc.nextInt();
	    	
	    	for(int j=0; j<wish; j++)
	    	{
	    		int a = sc.nextInt();
	    		addEdge(list, i, a);
	    	}
	    	
	    }
	    
	    boolean vis[] = new boolean[n+1];
	    int par[] = new int[n+1];
	    ArrayDeque<Integer>  stack = new ArrayDeque();
	    for(int l=1; l<=n; l++) 
	    {
		   if(vis[l] != true)
		   {
			   dfs(list, vis, par, l,stack);
		   }
	    }
	    
	    
//	   for(int i=0; i<=n; i++)
//		   System.out.print(par[i] + " " );
//	   System.out.println();
	   int boss = -1;
	   for(int a : stack)
	   {
		   if(par[a] == 0 && boss == -1)
			   boss = a;
		   else if(par[a] == 0)
			   par[a] = boss;
	   }
	   
	   for(int i=1; i<=n; i++)
		   System.out.println(par[i]);

	}

	private static void dfs(ArrayList<ArrayList<Integer>> list, boolean[] vis, int[] par, int l,ArrayDeque<Integer> stack) {
		// TODO Auto-generated method stub
		
		vis[l] = true;
		
		for(int a : list.get(l))
		{
		   if(vis[a] != true) {
			 par[a] = l;	
			 dfs(list, vis, par, a, stack);
			 
		   }
		}
		stack.addFirst(l);	   
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> list, int a, int b) {
		// TODO Auto-generated method stub
		
		list.get(a).add(b);	
		
	}

}
