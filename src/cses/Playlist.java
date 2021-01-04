package cses;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class Playlist {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String str[] = bf.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {arr[i] = Integer.parseInt(str[i]);
        
        }
        int j =0; 
        int ans = 0;
        for(int i =0; i<n; i++)
        {
        	j = Math.max(list.get(arr[i]), j);
        	ans = Math.max(ans, i-j + 1);
        	list.add(arr[i], i+1);
        }
        System.out.println(ans);
	}
}
