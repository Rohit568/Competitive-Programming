package Concepts;

public class RecursionOne {
	
	public static void solve(int n)
	{
//		if(n<=temp)
//		{
//			System.out.print(n + " ");
//			if(n<=0) x = -x;
//		    n = n + x;
//		    solve(n, temp, x);
//		}
		System.out.print(n+" ");
		if(n<=0) {
			return;
		}
		solve(n-5);
		System.out.print(n + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 16;
		
		solve(n);

	}

}
