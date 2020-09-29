package contests;

import java.util.Scanner;

public class Pipeline3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
	    if(n==1)
	    {
	    	System.out.println("0");
	    }else  if(n <= k)
	    {
	    	System.out.println("1");
	    }
	    else
	    {
	    	k--;
	    	n--;
	    	
	    	if(sum(k) < n)
	    		System.out.println(-1);
	    	else
	    	{
	    		System.out.println(minCalc(n, k));
	    	}
	    	
	    }

	}
	
	
	private static long minCalc(long n, long k) {
		// TODO Auto-generated method stub
		
		long start= 1; 
		long end = k;
		
		while(start< end)
		{
			long mid = (start + end)/2;
			
			long sum =sum(mid , k);
			
			if(sum == n)
			{
				return k - mid +1;
			}
			if(sum > n)
				start = mid + 1;
			else
				end = mid;
				
		}
		return k-start + 2;
		
	}


	public static long sum(long n)
	{
		return  n*(n+1)/2;
	}
	public static long sum(long s, long e)
	{
		if(s <= 1)
			return sum(e);
		else
			return sum(e) - sum(s-1);
	}

}
