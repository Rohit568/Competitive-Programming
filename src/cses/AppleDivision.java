package cses;
import java.io.*;
import java.util.*;
public class AppleDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		
		long arr[] = new long[n+1];
		
		long sum = 0;
		for(int i=0;i<n; i++) { 
			arr[i] = sc.nextInt();
		    sum = sum + arr[i];
		}
		
		long ans = Integer.MAX_VALUE;
		for(int i=1; i<=1<<n-1; i++)
		{
			long sum1 = fun(arr, i, n);
			ans = Math.min(ans,Math.abs(sum-sum1-sum1));
		}
		System.out.println(ans);
	}

	private static long fun(long arr[], int i, int n) {
		// TODO Auto-generated method stub
		long sum2 = 0;
		int k = n-1;
		while(i>0)
		{
			if((i&1)== 1)
			{
				sum2 = sum2 + arr[k];
			}
			k--;
			i = i>>1;
		}
		return sum2;
	}

}
