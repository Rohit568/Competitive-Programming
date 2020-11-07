package virtualcontests;
import java.util.*;
import java.io.*;

public class LongestSubsequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
	    int n = Integer.parseInt(bf.readLine());
	   
	    String str[] = bf.readLine().split(" ");
	    int arr[] = new int[n];
		HashMap<Integer, Integer> map =new HashMap<>();
		
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
			map.put(arr[i], 0);
		}
		
		int max = 0;
		for(int i=0; i<n; i++)
		{
			if(!map.containsKey(arr[i] -1))
			{
				map.put(arr[i], 1);
			}
			else
			{
				map.put(arr[i], map.get(arr[i]-1) + 1);
			}
			max = Math.max(map.get(arr[i]) , max);
		}
		System.out.println(max);
		StringBuilder sb = new StringBuilder("");
	    int fol = 0;
		for(int i=n-1; i >=0; i--)
		{
			if(max == map.get(arr[i]) && fol == 0)
			{
				sb.insert(0, " " + (i+1));
				fol = arr[i]-1;
			}
			else
			{
				if(fol == arr[i])
				{
					sb.insert(0," " + (i+1));
					fol = fol - 1;
				}
			}
		}
		
		System.out.println(sb.substring(1));
	}

}
