package contests;

import java.util.Scanner;

public class BMaxArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
	    
	    int arr[] = new int[n];
	    for(int i=0; i<n; i++) arr[i] =sc.nextInt();
	    int max = Integer.MIN_VALUE;
	    for(int i=0; i<n; i++)
	    {
	    	int j = i-1;
	    	int k = i+1;
	    	int count = 1;
	    	int temp =arr[i];
	    	while(j >=0 && temp >= arr[j])
	    	{
	    		temp = arr[j];
	    	     count++;
	    	     j--;
	    	}
	    	temp = arr[i];
	    	
	    	while(k<n && temp >= arr[k])
	    	{
	    		
	    	temp = arr[k];
	    	
	    	count++;
	    	k++;
	    	}
	    	
	    	if(count > max)
	    		max = count;
	    			
	    }
	    System.out.println(max);
	}
}
