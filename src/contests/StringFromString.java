package contests;


import java.util.HashMap;
import java.util.HashSet;

public class StringFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "dogisaloyalanimal";
		
		String str2 = "a alloy is god lamina";
		
		
		
		String s[] =str2.split(" ");
		
		int max = 0;
		
		for(int i=0; i<s.length; i++)
		{
			if(max < s[i].length())
				max = s[i].length();
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		
		HashMap<Integer, HashSet<String>> map2 = new HashMap<>();
		
		for(int i=0; i< str.length(); i++)
		{
			int j = i+1;
			
			while(j<i+max  && j< str.length())
			{
				if(map.containsKey(str.substring(i,j)))
				{
					map.put(str.substring(i,j), map.get(str.substring(i,j))+1);
		
				}
				else
					map.put(str.substring(i,j), 1);
				
				j++;
				
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
