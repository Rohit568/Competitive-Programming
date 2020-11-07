package contests;

import java.util.Scanner;


public class BExamPreparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    int sumHour = sc.nextInt();
	    
	    int a1 = 0;
	    int b1 = 0;
	    int a[] = new int[n];
	    int b[] = new int[n];
	    for(int i=0; i<n; i++)
	    {
	        a[i] = sc.nextInt();
	    	a1 = a1 + a[i];
	    	b[i]= sc.nextInt();
	    	b1 += b[i];
	    }
	    
	    
	    if(sumHour < a1 || sumHour > b1)
	    {
	       System.out.println("No");
	    }
	    else
	    {
	    	System.out.println("Yes");
	    	
	    	sumHour = sumHour - a1;
	    	
	    	for(int i=0; i<n; i++)
	    	{
	    		if(b[i] - a[i] < sumHour)
	    		{
	    			System.out.print(b[i] + " ");
	    			sumHour = sumHour -( b[i]- a[i]);
	    		}
	    		else
	    		{
	    			System.out.print(a[i] + sumHour + " ");
	    			sumHour = 0;
	    		}
	    	}
	    }
		
	}

}
