package Concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VanyaAndLanterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner sc = new Scanner(System.in);
	     
	     int n= sc.nextInt();
	     
	     int l = sc.nextInt();
	     
	     int arr[] = new int[n];
	     
	     for(int i=0; i<n; i++) arr[i] = sc.nextInt();
	     
	      Arrays.sort(arr);
	      
	      int maxDis = Integer.MIN_VALUE;
	      
	      for(int i=1; i<n; i++)
	      {
	    	  int dis = arr[i]-arr[i-1];
	    	  if(dis > maxDis)
	    		  maxDis = dis;
	      }
	      
	      double ans = Math.max((double)maxDis/2 , Math.max(arr[0], l -arr[n-1]) );
	     
	      System.out.println(
	    		  String.format("%.10f", ans));

	}

}
