package contests;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MinimumRangeQuery {
	
	public static int solution(int arr[], int l, int r, int n, int b[], int len)
	{
		int c_l = l/len;
		int c_r = r/len;
		
		int min = Integer.MAX_VALUE;
		
		if(c_l == c_r)
		{
			for(int i=l; i<=r; i++)
			{
				if(min >arr[i])
					min  = arr[i];
			}
			return min;
		}
		else
		{
			for(int i=l; i<(c_l + 1)*len - 1; i++)
			{
				if(arr[i] < min)
					min = arr[i];
			}
			for(int i=c_l+1;  i<= c_r - 1;  i +=len)
			{
				if(b[i] < min)
					min = b[i];
			}
			for(int i=c_r*len ; i<=r; i++)
			{
				if(arr[i] < min)
					min = arr[i];
			}
			return min;
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(reader.readLine());
	    String str[] = reader.readLine().split(" ");
	    int arr[] = new int[N];
	    for(int i=0;i<N; i++) arr[i] = Integer.parseInt(str[i]);

	     int part  = (int)Math.sqrt(N+.0) +1;
	     int b[] = new int[part];
	    int min = arr[0];
		for(int i=0; i<N; i++)
		{
            if(i%part== 0)
            	min = arr[i];
            if(min > arr[i])
            {
                min = arr[i];
            }
            b[i/part] = min;
		}
        int Q = Integer.parseInt(reader.readLine());
        for(int i=0; i<Q; i++)
        {
        	String str1[] =reader.readLine().split(" ");
        	int x = Integer.parseInt(str1[0]);
        	int y = Integer.parseInt(str1[1]);
        	int result = solution(arr, x, y, N, b, part);
        	System.out.println(result);
        }
	}
}