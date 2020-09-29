package contests;

import java.util.Scanner;

public class Color1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    char[][] a = new char[n][n];
	    
	    for(int i=0; i<n; i++ ) {
	    	String str = sc.next();
	    	for(int j =0; j<n; j++)
	    	{
	    		a[i][j] = str.charAt(j);
	    	}
	    }
	    
	    
	    int result = solve(a, n);
	    
	    System.out.println(result);
	    
	    
	    

	}

	private static int solve(char[][] a, int n) {
		// TODO Auto-generated method stub
		int rowdir[] = {-1, -1, -1, 0, 0, 1, 1 ,1};
		int coldir[] = {-1, 0, 1, -1, 1, -1, 0, 1 };
		boolean vis[][] = new boolean[n][n];
		int count = 0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(a[i][j]== '1' && vis[i][j] != true)
				{
					//System.out.println("entry1");
					performdfs(a, vis, i, j, n, rowdir, coldir);
					count++;
				}
			}
		}
		return count;
	}


		
	

	private static void performdfs(char[][] a, boolean[][] vis, int i, int j, int n, int[] rowdir, int[] coldir) {
		// TODO Auto-generated method stub
		
       vis[i][j] = true;
		
		for(int k = 0; k < 8; k++)
		{
			if(isPlaceble(a,vis, i+rowdir[k], j + coldir[k], n))
			{
				//System.out.println("entry2");
				vis[i+rowdir[k]][j + coldir[k]] = true;
				performdfs(a, vis, i + rowdir[k], j + coldir[k], n, rowdir, coldir);
			}
		}
		
	}

	private static boolean isPlaceble(char[][] a, boolean[][] vis, int i, int j, int n) {
		// TODO Auto-generated method stub
		if(i>=0 && j>=0 && i<n && j<n && a[i][j] == '1' && vis[i][j] != true) {
			//System.out.println("Entry3");
			return true;
			
		}
		
		return false;
	}
}
