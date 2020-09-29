package Graph;

import java.util.Scanner;

public class MakeTree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre");
		int n = sc.nextInt();
	
	    int k =sc.nextInt();
	    
	    int par[] = new int[n+1];
	    
	    int indegree[] = new int[n+1];
	    System.out.println("hello world");
	    for(int i=1; i<=k; i++)
	    {
	    	int m = sc.nextInt();
	    	for(int j=0; j<m; i++)
	    	{
	    		int u = sc.nextInt();
	    		indegree[u]++;
	    		par[u] = i;
	    	}
	    }
	    int boss = -1;
	    
	    for(int i=1; i<=n; i++)
	    {
	    	if(boss == -1 && par[i] == 0)
	    		boss  = i;
	    	else if(par[i] == 0)
	    		par[i] = boss;
 	    }
	    
	    for(int i=1; i<=n; i++)
	    	System.out.println(par[i]);
	

	}

}
