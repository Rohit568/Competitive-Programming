package virtualcontests;

import java.util.Scanner;

public class BusVideoSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
        int w = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int minB = Integer.MAX_VALUE;
        int maxB = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
        	int s = sc.nextInt();
        	sum = sum + s;
        	arr[i] = sum;
        	if(arr[i] < minB)
        	{
        		minB =  arr[i];
        	}
        	if(arr[i] > minB)
        	{
        		maxB = arr[i];
        	}
        	
        }
        int ans = 0;
        int max2 = Math.max(0, maxB);
        ans = w - max2 + 1;
         if(minB < 0)
         {
        	 ans = ans + minB;
         }
         
         if(ans > 0)
         {
        	 System.out.println(ans);
         }else
         {
        	 System.out.println(0);
         }
	}

}
