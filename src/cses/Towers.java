package cses;

import java.io.*;
public class Towers {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String str[] = bf.readLine().split(" ");

		int arr[] = new int[n];
		for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(str[i]);
		int max  = 0;
		int count = 0;
		for(int i=0; i<n;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
			else
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
