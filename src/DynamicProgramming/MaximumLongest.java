package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MaximumLongest{

	static class XandY{
		int x;
		int y; 
		XandY(int a, int b)
		{
			this.x = a;
			this.y = b;
		}
		
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		XandY  edge[] = new XandY[n];
		
		for(int i=0;i<n;i++)
		{
			String str[] = reader.readLine().split(" ");
			edge[i] = new XandY(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}
	    
		int arr[] = new int [n+1];
		int max = 1;
		arr[0] = 1;
		for(int i=1; i<n; i++)
		{
			arr[i] = 1;
			
			for(int j = i-1; j>=0; j--)
			{
				if(edge[i].x == edge[j].y && arr[j] >= arr[i])
					arr[i] = arr[i] + arr[j];
			}
			
			if(max < arr[i])
				max = arr[i];
		}
		
		System.out.println(max);
	}

}
