package NumberTheory;

import java.util.Scanner;

public class UVa11094 {
   static int m = 1000000007;
   
   static int fact[] = new int[10000000];
   static int invfact[] = new int[10000000];
   
	
	public static int BinaryExponention(int a, int b)
	{
		int r = 1;
		while(b>0)
		{
		if((b&1)== 1)
		    r = (r*a)%m;
			a = (a*a)%m;
			b = b>>1;
		}
		
		return r;
	}
	
	public static int modInverse(int a) {
		return BinaryExponention(a, m - 2);
//		 if(x< 0)
//		 {
//			 return (x%m+m)%m;
//		 }
//		 else
//			 return x;
		}
	
	public static void generateSeive()
	{
		fact[0] = 1; 
		invfact[0] = 1;
		for(int i=1; i<1000000; i++)
		{
			fact[i] =(fact[i-1] * i)%m;
			invfact[i] = (invfact[i-1]*modInverse(i))%m;
			System.out.println(fact[i] +"  " + invfact[i]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(BinaryExponention(2, 5));
		System.out.println(modInverse(5));
		generateSeive();
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int ans = 1;
		while(test-->0)
		{
			int n  = sc.nextInt();
			int k = 0;
			
			while(n>0)
			{
				int x = sc.nextInt();
				ans = (ans * fact[x+k-1])%m;
				ans = (ans * invfact[x-1])%m;
				ans = (ans * invfact[k])%m;
				k = k + x;
				n--;
			}
			
			System.out.print(ans);
		}
		System.out.println(ans);
		
	}

	
}
