package cses;

import java.util.Scanner;
import java.io.*;

public class CoinPiles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(n-->0)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int sum = x + y;
			int small, large;
			if(x< y) {
				small = x;
				large =y;
			}
			else
			{
				small = y;
			    large = x;
			}
			
			if((sum % 3==0 )&& (2*small >= large))
			{
				bw.write("YES");
			}
			else
			{
				bw.write("NO");	
			}
			if(n!=0)
			bw.write("\n");	
		}
		bw.close();

	}

}
