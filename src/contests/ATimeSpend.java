package contests;

import java.util.Scanner;

public class ATimeSpend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double ans = 0;
		for(int i=0; i<n-1; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int t = x - a;
			int s = y -b;
			
			int ts = t*t + s*s;
			//System.out.println(t +" "+ s + " "+ts);
			ans = ans  + Math.sqrt(ts);
			
			a = x;
			b =y;
		
		}
		
		System.out.println(String.format("%.9f" ,(ans * k)/50));

	}

}
