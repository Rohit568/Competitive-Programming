package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Frog2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = reader.readLine().split(" ");
		
		int stoneCount= Integer.parseInt(str[0]);
		int maxJump = Integer.parseInt(str[1]);
		
		String str1[] = reader.readLine().split(" ");
		
	    int stones[] = new int[stoneCount];
	    for(int i=0;i<stoneCount; i++) stones[i] = Integer.parseInt(str1[i]);
	    
	    int dp[] = new int[stoneCount+1];
	    Arrays.fill(dp, Integer.MAX_VALUE);
	    dp[0] = 0;
	    for(int i=0;i<stoneCount; i++)
	    {
	    	for(int j=i+1; j<=i+maxJump; j++)
	    	{
	    		if(j<stoneCount)
	    		{
	    			dp[j] = Math.min(dp[j], dp[i] + Math.abs(stones[i] - stones[j]));
	    		}
	    	}
	    }
	    System.out.println(dp[stoneCount-1]);
	}
}
