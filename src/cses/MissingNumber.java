package cses;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int xor = 1;
		
		for(int i=2; i<=n; i++)
			xor = xor ^i;
		
		for(int i=0; i<n-1; i++)
		{
			int k = sc.nextInt();
			xor = xor ^ k;
		}
		
		System.out.println(xor);

	}

}
