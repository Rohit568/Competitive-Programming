package contests;

import java.util.Scanner;

public class ColorFulField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int w = sc.nextInt();
		int u = sc.nextInt();
		
		int arr[][] = new int[n][m];
		
		for(int i=0; i<w; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
		    arr[a-1][b-1] = -1;
		}
		int k=0;
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				if(arr[i][j] == -1)
					continue;
				else
				{
					arr[i][j] = k%3;
					k++;
				}
			}
		}
		
		for(int i=0; i<u; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(solve(arr[a-1][b-1]));
		}

	}
	public static String solve(int a)
	{
		switch(a)
		{
		case  0: return "Carrots";
		case  1: return "Kiwis";
		case  2: return "Grapes";
		case -1: return "Waste";
		}
		return "";
	}

}
