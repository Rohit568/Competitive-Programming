package cses;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Watch implements Comparable<Watch>{
	int a;
	int b;
	Watch(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int compareTo(Watch c)
	{
		return this.b - c.b;
	}
}
public class MovieWatch {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		int a = 0; 
		int b = 0;
		ArrayList<Watch> list = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			String str[] = bf.readLine().split(" ");
			a = Integer.parseInt(str[0]);
			b = Integer.parseInt(str[1]);
			
			list.add(new Watch(a, b));
		}
		
		Collections.sort(list);
		
		int  i = 0;
		int temp = 0; 
		int ans = 0;
		
		while(i< n)
		{
			if(temp <= list.get(i).a)
			{
				temp  = list.get(i).b;
				i++;
				ans++;
			}
			else 
				i++;

		}
		
		System.out.println(ans);
	}

}
