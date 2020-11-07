package contests;

import java.util.Scanner;

public class BigMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 
		 while(true)
		 {
			 
			 int B = sc.nextInt();
			 
			 if(B == 0)
				 break;
			 int P = sc.nextInt();
			 int M = sc.nextInt();
			 
			 long res = letSolve(B, P, M);
			 
			 System.out.println(res);
			 
		 }
	}
	
	
	public static long letSolve(int B, int P, int M)
	{
	     long  i = 1;
	     
	     while(P > 0)
	     {
	    	 if((P&1) > 0)
	    		 i = (i * B)% M;
	    	 B = ((B%M)*(B%M))%M;
	    	 P = P >> 1;
	    	
	     }
	     
	     return i;
	        
	}

}
