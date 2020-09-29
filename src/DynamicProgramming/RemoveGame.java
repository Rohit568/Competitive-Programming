package DynamicProgramming;

import java.util.Scanner;

public class RemoveGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		
		int player1  =0;
		int player2 = 0;
		
		boolean sw = false;
		int ans = letsSolve(arr, 0, n-1, 0,0, sw);
		
		System.out.println(ans);
		
		

	}
	
	public static int letsSolve(int arr[], int i, int j,  int sum, int sum2, boolean sw)
	{
		if(i==j)
			return sum + arr[i];
		else
		{
			sw = sw ^ true;
			int ffirst = 0;
			int fsecond = 0;
			int sfirst = 0; 
			int ssecond = 0;
			int ans = 0;
			
			if(sw == true)
			{
				ffirst = letsSolve(arr, i+1, j, sum+arr[i], sum2,sw);
				fsecond = letsSolve(arr, i, j-1, sum + arr[j],sum2,  sw);
				System.out.println(arr[i] + " " + arr[j]+ " ll");
			}
			else
			{
				sfirst = arr[i] + letsSolve(arr, i+1, j,sum, sum2 + arr[i],sw);
				ssecond = arr[j] + letsSolve(arr, i, j-1,sum, sum2 + arr[j], sw);
				System.out.println(arr[i] + " " + arr[j]+ " kk");
				
			}
			return Math.max(sum, sum2);
		}
	}

}
