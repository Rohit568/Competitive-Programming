package contests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int test = sc.nextInt();
		
		while(test-->0) {
		int n = sc.nextInt();
		
		
		HashMap<Character, Integer> map  = new HashMap<>();
		
		for(int i=0; i<n; i++)
		{
			String str = sc.next();
			
			for(int j=0; j<str.length(); j++)
			{
				if(map.containsKey(str.charAt(j)))
				{
					map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
				}
				else
				{
					map.put(str.charAt(j), 1);
				}
			}
				

		}
		
		int flag = 1;
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			int s = entry.getValue();
			if(s%n != 0)
			{
				flag = 0;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		}
	}

}
