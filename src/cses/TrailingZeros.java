package cses;

import java.util.Scanner;

public class TrailingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int m = 5;
		int res = 0;
		while(m <=n)
		{
			res = res + n/m;
			m = m*5;
		}
		System.out.println(res);

	}

}
