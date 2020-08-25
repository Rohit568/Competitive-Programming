package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grid1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = reader.readLine().split(" ");
		
		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		char[][] ch = new char[H][W];
		for(int i=0; i<H; i++)
		{
			String str1 = reader.readLine();
			char c[] = str1.toCharArray();
			for(int j=0; j<W; j++)
			{
				ch[i][j] = c[j];
			}
		}
		
		System.out.println(calculateTotalPath(ch, H, W));

	}

	private static int calculateTotalPath(char[][] ch, int h, int w) {
		// TODO Auto-generated method stub
		int mod = (int)Math.pow(10, 9) + 7;
		int dp[][] = new int[h+1][w+1];
		
		for(int i=0; i<h; i++)
		{
		    if(ch[i][0] == '#')
		    	break;
			dp[i][0] = 1;
		}
		for(int j=0; j<w; j++)
		{
			if(ch[0][j] =='#')
				break;
			dp[0][j] = 1;
		}
		
		for(int i=1; i<h; i++)
		{
			for(int j=1; j<w; j++)
			{
				if(ch[i][j] == '#')
				{
					continue;
				}
				else {
					if(ch[i-1][j] =='.' && ch[i][j-1] == '.')
						dp[i][j] = (dp[i-1][j] + dp[i][j-1])%mod;
					else if(ch[i-1][j] =='#' && ch[i][j-1]=='.' )
						dp[i][j] = dp[i][j-1];
					else
						dp[i][j] = dp[i-1][j];		
				}		
			}
		}
		
		
		return dp[h-1][w-1];
	}

}
