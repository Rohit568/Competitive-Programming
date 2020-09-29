package contests;

import java.util.Scanner;

public class PipeLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		long k = sc.nextLong();
		
		long sum =  (k *(k+1))/2 -1;
		System.out.println(sum);
		
		//System.out.println(sum);
		if(sum <= n-1)
			System.out.println(-1);
		else
		{
			long ans=0;
			long res =-1;
				long j =k;
				while(n >= 0 && j>=2)
				{
						if(n <= j)
						{
							ans++;
							n = 0;
						
						}
						else {
					   ans++;
					  // System.out.print("select first=  " + j);
				     	n = n-(j--) + 1;
				     	//System.out.println("n becomes=  "+n);
						}
						if(n==0)
						{
							res = ans;
							break;
						}
					
				}
			if(res == -1)
			System.out.println(res);
			else
				System.out.println(res);
		}
	}

}
