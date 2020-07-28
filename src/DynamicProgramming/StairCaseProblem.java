package DynamicProgramming;


import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class StairCaseProblem {
    
    static HashMap<String, Integer> map = new HashMap<>();
	public static int Solution(int n, int m)
	{
		
	  
		if(n == 0)
			return 1;
		if(n< 0)
			return 0;
		
		String key = n+" "+m;
		
		//if(map.containsKey(key)) {
			//System.out.print("1");
		//	return map.get(key);
			
		//}
	    int count = 0;
		for(int i=1; i<=m; i++)
		{
			count  = count + Solution(n-i, m);
			System.out.print("0");
		}
		 map.put(key, count);
		
	     return count;
		
	}
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
	    System.out.print(Solution(n, m));
		
		

	}

}
