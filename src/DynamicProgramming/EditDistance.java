package DynamicProgramming;
import java.io.*;
import java.util.*;
public class EditDistance{
	public static int lcs(String s1,String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		int dp[][] = new int[l1+1][l2+2];
		for(int i=0;i<=l1;i++) {
			for(int j=0;j<=l2;j++) {
				if(i==0)
					dp[i][j]=j;
				else if(j==0)
					dp[i][j]=i;
				else {
					if(s1.charAt(i-1)==s2.charAt(j-1)) {
						dp[i][j]=dp[i-1][j-1];
					}else {
						dp[i][j] = 1+Math.min(Math.min(dp[i-1][j], dp[i][j-1]),dp[i-1][j-1]);
					}
				}
			}
		}
		
		
		return dp[l1][l2];
	}
	public static void main(String[] args) throws IOException{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String st1 = br.readLine();
		String st2 = br.readLine();
		bw.write(String.valueOf(lcs(st1,st2)));
		//sc.close();
		br.close();
		bw.close();
	}
	
}
