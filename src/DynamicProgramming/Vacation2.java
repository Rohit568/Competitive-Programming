package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vacation2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		int poll[][] = new int[n][3];
		
		for(int i=0; i<n; i++)
		{
			String str[] =  reader.readLine().split(" ");
			for(int j=0; j<3; j++)
			{
				poll[i][j] = Integer.parseInt(str[i]);
			}
				
		}
		
		int dp[][] = new int[n][3];
		
		dp[0][0] = poll[0][0];
		dp[0][1] = poll[0][1];
		dp[0][2] = poll[0][2];
		
		for(int i=1; i<n; i++)
		{
			for(int j=0; j<3; j++)
			{
				dp[i][j] = 0;
				
				for(int k =0; k<3; k++)
				{
					if(j!=k)
					{
						dp[i][j] = Integer.max(dp[i][j] , poll[i][j] + dp[i-1][k]);
					}
				}
			}	
		}
		
		int result =Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
		System.out.println(result);
    }
}
