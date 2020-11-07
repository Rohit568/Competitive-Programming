package mathsand;
import java.util.*;
 
class AandB
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		while(test-->0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			long ans = calculate(a, b);
			
			int last_digit = (int)(ans %10);
			System.out.println(last_digit);
		}
	}
 
	public static long calculate(int a, int b)
	{
		

		long res = 1;
		while(b >0)
		{
			 if((b&1) == 1)
				 res = res * a;
			  a = a*a;
			  b = b>>1;
		}
		return res;
	}
} 
 