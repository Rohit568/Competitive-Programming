package cses;

import java.util.Scanner;

public class IncreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		long ans = 0;
		for(int i = 1; i<n; i++)
		{
			int w  = sc.nextInt();
			
			if(w < t)
			{
				ans = ans + t-w;
				
			}
			else
				t = w;
		}
		
		System.out.println(ans);

	}

}
