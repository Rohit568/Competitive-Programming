package virtualcontests;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TwoGrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new  Scanner(System.in);
		
		int n = sc.nextInt();
		
		String str = sc.next();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<str.length()-1; i++)
		{
	       if(map.containsKey(str.substring(i, i+2)))
			{	
			map.put(str.substring(i, i+2), map.get(str.substring(i, i+2)) + 1);
		     }
	       else
	       {
	    	   map.put(str.substring(i, i+2), 1);
	       }

	   }
		
		int max = 0;
		String ans = "";
		for(String st : map.keySet())
		{
			if(max< map.get(st))
			{
				max = map.get(st);
				ans = st;
			}
		}
		System.out.println(ans);

}
}
