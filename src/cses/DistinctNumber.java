package cses;

import java.util.Scanner;
import java.util.*;
import java.io.*;
public class DistinctNumber {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter ot = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bf.readLine());
		
		String[] str = bf.readLine().split(" ");
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i<n; i++)
		{
			int a = Integer.parseInt(str[i]);
			set.add(a);
		}
		System.out.println(set.size());

	}

}
