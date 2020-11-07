package contests;

import java.util.Scanner;

public class OnOffBulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true)
		{
			long n =sc.nextLong();
			
			if(n==0)
				break;
			
            double s = Math.sqrt(n);
            
            if(Math.floor(s) == Math.ceil(s))
            {
            	System.out.println("yes");
            	
            }
            else
            {
            	System.out.println("no");
            	
            }
            
		}
	}

}
