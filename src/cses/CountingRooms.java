package cses;

import java.util.Scanner;

public class CountingRooms {
    static int d[][] = new int[1001][1001];
    static boolean vis[][] = new boolean[1001][1001];
    static int rd[] = {1, -1, 0, 0};
    static int cd[] = {0, 0, -1, 1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		int flag =1;
		for(int i = 0; i<r; i++)
		{
	          String str = sc.next();
	          
	          for(int j = 0; j<c; j++)
	          {
	        	  d[i][j] = str.charAt(j);
	        	  
	        	  if(d[i][j] == '#') {
	        		  vis[i][j] = true;
	        		  flag =0;
	        	  }
	          }
		}
		
		int count = 0;
		if(flag == 1)
		{
			count=1;
		}else {
		for(int i = 0; i<r; i++)
		{
			for(int j = 0;j<c; j++)
			{
				if(vis[i][j] != true)
				{
					  dfs(i, j, r, c);
					  count++;
				}
			}
		}
		}
		System.out.println(count);

	}
	
	public static void dfs(int k, int j, int r, int c)
	{
		vis[k][j] = true;
		
		for(int i = 0; i< 4; i++)
		{
			if(isValid(k + rd[i], j+ cd[i], r, c))
			{
				dfs(k + rd[i], j + cd[i], r,c);
			}
		}
	}
	
	public static  boolean isValid(int i , int j, int r, int c) {
		
		if((i < 0 || i> r- 1) || (j < 0 || j > c - 1) || vis[i][j])
			return false;
		return true;
	}

	

}
