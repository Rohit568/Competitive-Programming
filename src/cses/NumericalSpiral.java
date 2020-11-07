package cses;

import java.util.Scanner;
import java.io.*;
public class NumericalSpiral {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int test = Integer.parseInt(br.readLine());
		
		while(test-->0)
		{
            String str[] = br.readLine().split(" ");
			long x = Integer.parseInt(str[0]);
			long y = Integer.parseInt(str[1]);
			
			long first = 0;
			if(x < y)
			{
				first = y*y -y;
				if(y %2 ==0)
				{
					first = first -(y-x);
				}
				else
				{
					first = first + (y-x);
				}
			}
			else
			{
				first = x*x - x;
				if(x%2 == 0)
				{
					first = first + (x-y);
				}
				else
				{
					first = first  - (x-y);
				}
			}
			
			bw.write(String.valueOf(first+1)+"\n");
		}
		bw.close();
		br.close();

	}

}
