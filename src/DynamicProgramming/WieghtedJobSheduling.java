package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WieghtedJobSheduling {
	
	public static void findAnswer(JobTime A[], int n)
	{
		
		
		int maxProfit = A[0].wieght;
		int start = A[0].init;
		int end = A[0].fin;
		int ans[] = new int[n+1];
		ans[0] = A[0].wieght;
		for(int i = 0; i<n; i++)
		{
			ans[i] = 0;
			for(int j = 0; j <i; j++)
			{
				if(A[j].fin <= A[i].init   && ans[i] < ans[j])
					ans[i] = ans[j];
			}
			
			ans[i] += A[i].wieght;
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(ans[i]+" ");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        JobTime[] A = new JobTime[n];
        for(int i=0;i<n; i++)
        {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	A[i] = new JobTime(a,b,c);
        }
        Arrays.sort(A, new MyComparator());  
        findAnswer(A, n);
	}
	
	

}

class MyComparator implements Comparator<JobTime>{
	public int compare(JobTime j, JobTime k)
	{
		return j.init - k.init;
	}
}

class JobTime{
	int  init;
	int fin;
	int wieght;
	JobTime(int a, int b, int c)
	{
	     init = a;
	     fin = b;
	     wieght = c;
	}
}
