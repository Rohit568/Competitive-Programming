package Concepts;

import java.math.BigInteger;
import java.util.Scanner;

public class PerfectSqure {

	public static boolean isPerfect(int n)
	{
		double s = Math.sqrt(n);
	    
		if((s - Math.floor(s)) == 0)
			return true;
		else
			 return false;
	}
	
	public static BigInteger factorial(int num){
	    if (num<=1)
	        return BigInteger.ONE;
	    else
	        return factorial(num-1).multiply(BigInteger.valueOf(num));
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		StringBuilder sb = new StringBuilder("");
		int flag = 0;
		for(int i = 0; i<n; i++)
		{
			if(isPerfect(arr[i]))
			{
			    flag = 1;
			    BigInteger b = factorial(arr[i]);
			    
			    String str = b.toString();
			    
			   System.out.println(str);
			    
			    //for calculating trainling zero ppw required;
                int s  = (int)(Math.log(arr[i])/Math.log(5));
                
                //System.out.print(s + "fjf ");
                
			    
			    int trailing0 = 0;
			    //calculating trailing zero using formula
			    while(s>0)
			    {
			    	trailing0 = trailing0 +  arr[i]/(int)Math.pow(5, s);
			    	s--;
			    }
			    
			    
			    
			    if(trailing0 == 0)
			    {
			    	if(str.length() <3)
			    	sb.append(str).append(", ");
			    	else
			    	{
			    		String str2 = str.substring(str.length()-3);
			    		String ans = "";
			    		for(int j=0; j<str2.length(); j++)
			    		{
			    			if(str2.charAt(j) != '0')
			    				ans = ans + str2.charAt(j);
			    			
			    		}
			    		sb.append(ans).append(", ");
			    	}
			    }
			    else
			    {
			    	String str2 =  str.substring(str.length()-trailing0 - 3, str.length()-trailing0);
			    	String ans = "";
		    		for(int j=0; j<str2.length(); j++)
		    		{
		    			if(str2.charAt(j) != '0')
		    				ans = ans + str2.charAt(j);
		    			
		    		}
		    		sb.append(ans).append(", ");
		    		
			    }
			    
			    
			}
		}
		
		if(flag == 0)
			System.out.println("-1");
		else
		{
			sb.deleteCharAt(sb.length()-2);
			System.out.println(sb);
		}
	}

}

/*
check out put for this u will understand each case....
 7
53 64 16 100 36 49 25
1
10000
*/
