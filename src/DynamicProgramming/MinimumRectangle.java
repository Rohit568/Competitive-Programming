package DynamicProgramming;

import java.util.Scanner;

public class MinimumRectangle {

	
	public static int minimum_rectangle(int a, int b)
	{
		if (a == b)
			return 0;
		if(a < 0 || b< 0)
			return 0;
		int ans = 0;
		int first, second;
		if(a < b)
		{
			first = 1 +minimum_rectangle(a, a);
			second = minimum_rectangle(a, b-a);
			
		}
		else
		{
			first = 1 + minimum_rectangle(b, b);
			 second = minimum_rectangle(b, a-b);
		}
		return first + second;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Scanner sc = new Scanner(System.in);
	   
	   int n = sc.nextInt();
	   int m = sc.nextInt();
       System.out.println(minimum_rectangle(n, m));
       
       
	}

}
