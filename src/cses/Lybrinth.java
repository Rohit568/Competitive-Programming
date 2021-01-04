package cses;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lybrinth {
    static char d[][] = new char[1001][1001];
    static boolean vis[][] = new boolean[1001][1001];
    static Pair2 parent[][] = new Pair2[1001][1001];
    static int r;
    static int c;
    static int flag = 0;
    static int rowdir[] = {1, -1, 0, 0};
    static int coldir[] = {0, 0,  1, -1};
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 r = sc.nextInt();
		 c = sc.nextInt();
	
		for(int i = 0; i<r; i++)
		{
	          String str = sc.next();
	          
	          for(int j = 0; j<c; j++)
	          {
	        	  d[i][j] = str.charAt(j);
	        	  
	        	  if(d[i][j] == '#') {
	        		  vis[i][j] = true;  
	        	  }
	          }
		}
		
		
		int count = 0;
		
		for(int i = 0; i<r; i++)
		{
			for(int j = 0;j<c; j++)
			{
				if( d[i][j] == 'A')
				{
					  BFS(i, j);  
				}
			}
		}

	}
	
	
	public static void BFS(int x, int y)
	{
		Pair p = new Pair(x, y);
		Queue<Pair> queue = new LinkedList<>();
		queue.add(p);
		//System.out.println(x + " " + y);
		while(!queue.isEmpty()) {
			p  = queue.poll();
			int  k = p.x;
			int  j = p.y;
			//System.out.println(k +" " + j);
			for(int i= 0; i<4 ;i++)
			{
				//System.out.println(i);
				if(isValid(k + rowdir[i], j + coldir[i]))
				{
					Pair p1 = new Pair(k + rowdir[i], j + coldir[i]);
					
					char l = '.';
					if(i == 0)
						l = 'D';
					if(i == 1)
						l = 'U';
					if(i ==2)
						l = 'R';
					if(i==3)
						l = 'L';
					//System.out.print(l + " ");
					queue.add(p1);
					vis[k + rowdir[i]][j + coldir[i]] = true;
					parent[k + rowdir[i]][j + coldir[i]]  = new Pair2(p, l);
					
					if(d[k + rowdir[i]][j + coldir[i]] == 'B')
					{
						queue.clear();
						flag = 1;
						Pair2 p2 = parent[k + rowdir[i]][ j + coldir[i]];
						Pair p3 = p2.p;
						int m  = p3.x;
						int n  = p3.y;
						char t = p2.c;
						String ans = ""+t;
						while(d[m][n] != 'A')
						{
							p2  = parent[m][n];
							ans = p2.c + ans;
							p3 = p2.p;
							m = p3.x;
							n = p3.y;
						}
						
						System.out.println("YES" + "\n" + ans.length() +"\n" +ans);
					}	
				}
			}
			
			
		}
		if(flag != 1)
		{
			System.out.println("NO");
		}
		
	}
	
	public static boolean isValid(int x , int y)
	{
		if(x < 0 || y < 0 || x >=r || y >= c || vis[x][y])
			return false;
		return true;
	}
	
	
}

class Pair{
	int x, y;
	Pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Pair2{
	Pair p;
	char c;
	Pair2(Pair p, char c)
	{
		this.p = p;
		this.c = c;
	}
}

	
/*
 *
5 8
########
#.A#...#
#.####B#
#....#.#
########
*/