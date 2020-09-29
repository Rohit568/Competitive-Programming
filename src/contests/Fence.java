package contests;

import java.util.Scanner;

public class Fence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int k = sc.nextInt();
		
		int hi[] = new int[n];
		
		for(int i=0; i<n; i++) hi[i] = sc.nextInt();
		int sum = 0;
		for(int i=0; i<k; i++)
		{
			sum = sum + hi[i];
		}
		int ans = 1;
		int min = sum;
		for(int i=1;i<n;i++)
		{
			if(i+k -1 < n) {	
			sum = sum - hi[i-1] + hi[i+k-1];
			
			if(sum < min) {
				min = sum;
			    ans = i+1;
			}
		    }
	   }
		System.out.println(ans);
	}
}
