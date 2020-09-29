package contests;

import java.util.Scanner;

public class BDecoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String ans = "";
		int r = 1;
		if(n%2 == 0)
			r= 0;
		for(int i=0; i<n; i++)
		{
			if(r == 1)
			{
				ans = ans + str.charAt(i);
				r = 0;
			}
			else
			{
				ans = str.charAt(i) + ans;
				r = 1;
			}
		}
		System.out.println(ans);
	}
}
