package contests;

import java.util.Scanner;

public class EasyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		
		int test= sc.nextInt();
		
		while(test-->0)
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a = sc.nextInt();
			int d = sc.nextInt();
			
			int count = 0;
			for(int i=m; i<=n; i++)
			{
				if(i%a==0 || (i%(a+2*d))==0 || (i%(a+3*d))==0 ||(i%(a+4*d))==0 || (i%(a+d))==0)
				{
					
				}
				else
					count++;
			}
			System.out.println(count);
		}

	}

}
