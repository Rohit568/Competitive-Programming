package contests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = { "ABC", "ACB", "BCA", "BAC", "CAB", "CBA"};
		
	    String str2[] = new String[3];
	    
	    for(int i=0; i<3; i++)
	    {
	    	str2[i] = sc.nextLine();
	    }
	    
	    String ans = "";
	    int count = 0;
	    int flag = 1;
	    for(int i= 0; i<6; i++)
	    {
	          count = 0;
	          flag = 1;
	    	for(int j=0 ; j<3; j++)
	    	{
	    		
	    		if(str2[j].charAt(1) == '>' )
	    		{
	    			if( str[i].indexOf(str2[j].charAt(0)) >  str[i].indexOf(str2[j].charAt(2))) {
	    				count++;
	    			}
	    			else
	    			{
	    				flag = 0;
	    				break;
	    			}
	    		}
	    		else
	    		{
	    			if(str[i].indexOf(str2[j].charAt(0)) < str[i].indexOf(str2[j].charAt(2)))
	    			{
	    				count++;
	    			}
	    			else
	    			{
	    				flag = 0;
	    				break;
	    			}
	    			
	    		}
	    		
	    		
	    		
	    	}
	    	if(count == 3)
    		{
    		    flag =1;
    			System.out.println(str[i]);
    			break;
    		}
	    }
	    
	    if(flag == 0)
	    {
	    	System.out.println("IMPOSSIBLE");
	    }   
	}	

}
