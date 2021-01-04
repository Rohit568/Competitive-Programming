package cses;
import java.io.*;
import java.util.*;
public class MaximumSubarraySum {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine());
		String str[] = bf.readLine().split(" ");
		long ma = Integer.MIN_VALUE;
		long sum = 0;
		for(int i=0; i<n; i++)
		{
			Long a  = Long.parseLong(str[i]);
			sum = Math.max(sum + a, a);
			ma = Math.max(sum, ma);
		}
		
		System.out.println(ma);
	}

}
