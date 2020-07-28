package DynamicProgramming;

import java.util.HashMap;

public class MinimumCostToReachStartToEnd {
	static HashMap<String, Integer> map  = new HashMap<>();
	public static int recursionSolution(int mat[][], int si, int sj, int ei, int ej)
	{
		if(si== ei && sj == ej)
		{
		    //System.out.print(mat[si][sj]);
			return mat[si][sj];
		}
		
		if(si>ei || sj > ej)
			return Integer.MAX_VALUE;
		
		String key = si+""+sj;
		
		if(map.containsKey(key))
			return map.get(key);
		
		int option1 = recursionSolution(mat, si + 1, sj, ei, ej);
		int option2 = recursionSolution(mat, si, sj+1, ei,ej);
		int option3 = recursionSolution(mat, si+1, sj+1, ei, ej);
		
		int res = mat[si][sj] + Math.min(option1, Math.min(option2, option3));
		map.put(key, res);
		return res;
		
	}
	
	public static int DPSolution(int mat[][], int m, int n)
	{
		int DP[][]  = new int[m][n];
		
		DP[m-1][n-1] = mat[m-1][n-1];
		for(int i=n-2; i>=0; i--)
		{
			DP[m-1][i] = DP[m-1][i+1] + mat[m-1][i];
		}
		
		for(int j = m-2; j>=0; j--)
		{
			DP[j][n-1] = DP[j+1][n-1] + mat[j][n-1];
		}
		
		for(int i=m-2; i>=0; i--)
		{
			for(int j = n-2; j>=0; j--)
			{
			    DP[i][j] = mat[i][j] + Math.min(DP[i][j+1],Math.min(DP[i+1][j], DP[i+1][j+1]));
			}
		}
//		System.out.println();
//		
//		for(int i = 0; i<m; i++)
//		{
//			for(int j = 0; j<n; j++)
//			{
//				System.out.print(DP[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		return DP[0][0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = { {2, 3, 5}, {1, 4, 7}, {9, 7, 6} };
		
		System.out.print(recursionSolution(mat, 0, 0, 2,2));
		System.out.print(DPSolution(mat, 3, 3));

	}

}
