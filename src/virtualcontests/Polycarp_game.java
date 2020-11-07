package virtualcontests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Polycarp_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long arr[] = new long[n];
		
		HashMap<Long, Long> map = new HashMap<>();
		for(int i =0; i<n; i++)
		{
		    long k = sc.nextLong();
		    arr[i] = k;
		    map.put(k, (long)0);
		}
		
		for(int i=0; i<n; i++)
		{
			if(map.containsKey(arr[i]*2))
			{
				map.put(arr[i], arr[i]*2);
			}
			else if(arr[i]%3 == 0 && map.containsKey(arr[i]/3))
			{
				map.put(arr[i], arr[i]/3);
			}else
				map.put(arr[i], (long)-1);
		}
		
		long start = -1;
		for(long value : map.keySet())
		{
			
			if(!map.containsValue(value))
			{
				
				start = value;
			
			}
			
			
			
		}
		//System.out.println(start);
		
		//System.out.println(map);
		while(start != (long)-1)
		{
			System.out.print(start+" ");
			start = map.get(start);
		}

	
		//System.out.print(map);
		
	}
}
