package cses;
import java.io.*;
import java.util.*;


public class RestaurantCustomer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> arr= new ArrayList<Integer>();
		ArrayList<Integer> dep=  new ArrayList<Integer>();
		
		for(int i=0; i<n; i++)
		{
			String  str[] = bf.readLine().split(" ");
		   arr.add(Integer.parseInt(str[0]));
		  dep.add(Integer.parseInt(str[1]));
		}
		
		Collections.sort(arr);
		Collections.sort(dep);
		//System.out.println(dep + " " + arr);
		int minman = 1;
		
		int j = 1;
		int i = 0;
		int max = 1;
		while(i < n && j<n)
		{
			if(arr.get(j) <= dep.get(i))
			{
				minman++;
				j++;
			}else if(arr.get(j) > dep.get(i))
			{
				minman--;
				i++;
			}
			//System.out.println("..." + i +" " + j);
			max = Math.max(minman, max);
		}
		
		System.out.println(max);
		
	}
	
}
