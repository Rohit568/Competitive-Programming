package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vacation {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int vacationDays = Integer.parseInt(reader.readLine());
		
		int a[] = new int[vacationDays];
		int b[] = new int[vacationDays];
		int c[] = new int[vacationDays];
		
		for(int i=0; i<vacationDays; i++)
		{
			String str[] = reader.readLine().split(" ");
			
			a[i] = Integer.parseInt(str[0]);
			b[i] = Integer.parseInt(str[1]);
			c[i] = Integer.parseInt(str[2]);
		}
		int n = vacationDays;
		int sum1 = solution(a, b, c, 0,  n, 0);
		int sum2 =  solution(a, b, c, 1, n, 0);
		int sum3 = solution(a, b, c, 2, n, 0);
		
		int maximumDays = Math.max(sum1, Math.max(sum2, sum3));
		
		System.out.println(maximumDays);
	}
	
	public static int solution(int a[], int b[], int c[],  int k, int n, int i)
	{
		
		if(i==n)
			return 0;
		
		int sum1=0, sum2= 0, sum3 = 0;
		
		
		
		if(k==0)
			sum1 = a[i] + Math.max(solution(a, b, c, 1, n, i+1), solution(a, b, c, 2, n, i+1));
		if(k==1)
			sum2 = b[i] + Math.max(solution(a, b, c, 0, n, i+1), solution(a, b, c, 2, n, i+1));
		if(k==2)
			sum3 = c[i] + Math.max(solution(a, b, c, 1, n, i+1), solution(a, b, c, 0, n, i+1));
		
		
		//dp[i] = Math.max(sum1, Math.max(sum2, sum3));
        return Math.max(sum1, Math.max(sum2, sum3));	
	}

}
