package cses;

import java.util.Scanner;

public class TwoKnights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		if(i==1)
            System.out.println(0);
        else if(i==2)
            System.out.println(6);
        else
        {
            long p=i*i;
            long j=i-2,k=p*(p-1)/2;
            k-=8*j*(j+1)/2;
            System.out.println(k);
        }
		
	}

}
