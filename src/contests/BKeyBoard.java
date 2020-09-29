package contests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class BKeyBoard {
 
	
	static class Pair{
	    int row, col;
	    Pair(int a, int b)
	    {
	    	row = a;
	    	col = b;
	    	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m= sc.nextInt();
		int r = sc.nextInt();
		
		HashMap<Character, Pair> map = new HashMap<>();
		HashSet<Pair> set = new HashSet();
		for(int i=0; i<n; i++)
		{
			String str = sc.next();
			for(int j = 0; j<m; j++)
			{
				if(str.charAt(j) != 'S')
				map.put(str.charAt(j), new Pair(i+1, j+1));
				else
					set.add(new Pair(i+1, j+1));
			}
		}
		
		int q = sc.nextInt();
		String str2 = sc.next();
		int count = 0;
		int flag = 0;
		for(int i=0;i <q; i++)
		{
			
			if(!map.containsKey(str2.charAt(i)) || ((!map.containsKey((char)((int)str2.charAt(i) + (int)('a' - 'A')))) && set.size() > 0))
			{
				flag = 1;
				System.out.println(-1);
				break;
			}
			
	        Pair p = map.get(str2.charAt(i)); 
	        
	        
	        
	        Iterator<Pair> itr = set.iterator();
	        int t = 0;
	        while(itr.hasNext())
	        {
	        	Pair s = itr.next();
	        	
	        	double calc = Math.sqrt(Math.pow(Math.abs(p.row-s.row),2)+ Math.pow(Math.abs(p.col -s.col), 2));
	        	
	        	if(calc <= r)
	        	break;
	        	t++;
	        }
	        
	        if(t == set.size())
	        	count++;
	        
	        
		}
		
		if(flag == 0)
        	System.out.println(count);
      
	}

}
