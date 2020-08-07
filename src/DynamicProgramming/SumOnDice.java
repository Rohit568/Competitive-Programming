package DynamicProgramming;

import java.util.HashMap;

public class SumOnDice {
	

	public static int solvefor(int sum, int n, HashMap<String, Integer> map)
	{
		if(n==0)
			if(sum == 0)
				return 1;
			else
				return 0;
		if(sum < 0)
			return 0;
		int count = 0;
	
		String key = sum + "|" + n;
		
		if(map.containsKey(key))
			return map.get(key);
	
		for(int i=1; i<=6; i++)
		{
			count = count + solvefor(sum -i, n-1, map);
		}
		map.put(key, count);
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		System.out.println(solvefor(50, 10, map));
		
	}
}
