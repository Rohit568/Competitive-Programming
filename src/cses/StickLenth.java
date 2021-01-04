package cses;

import java.io.*;
import java.util.*;
public class StickLenth {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String str[] = bf.readLine().split(" ");
		
		ArrayList<Long> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) list.add(Long.parseLong(str[i]));
		
		Collections.sort(list);
		
		int mid = n/2;
		long ans = 0;
		for(long x : list)
		{
			ans = ans + Math.abs(x - list.get(mid));
		}
		System.out.println(ans);
	}
}
