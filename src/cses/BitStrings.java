package cses;

import java.util.Scanner;

public class BitStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner sc = new Scanner(System.in);
		 int mod = (int)Math.pow(10, 9) + 7;
		 int n = sc.nextInt();
		 int res = 1;
		 while(n>0)
		 {
			 res = (res*2)%mod;
			 n=n-1;
		 }
		 System.out.println(res);

	}

}
