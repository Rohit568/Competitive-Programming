package virtualcontests;

import java.util.*;
import java.io.*;
public class Letters {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long arb[] = new long[n];
		long limit[] = new long[n];
		long sum = 0;
		for(int i=0;i <n; i++)
		{
			arb[i] =sc.nextLong();
			sum = sum + arb[i];
			limit[i] = sum ;
			
		}
		long rooms[] = new long[m];
		int j = 0;
		for(int i=0; i<m; i++)
		{
			rooms[i] = sc.nextLong();
			
			if(rooms[i] <= limit[j] && j == 0)
			{
				System.out.println(j + 1 + " " + rooms[i]);
			}
			else if(rooms[i] <= limit[j])
			{
				System.out.println(j + 1 + " " + (rooms[i]-limit[j-1]));
			}
			else
			{
				while(rooms[i]>limit[j])
				{
					j++;
				}
				System.out.println(j + 1 + " " + (rooms[i]-limit[j-1]));
			}
				
		}
		

	}
	
	
	
	 static class FastReader 
	    { 
	        BufferedReader br; 
	        StringTokenizer st; 
	  
	        public FastReader() 
	        { 
	            br = new BufferedReader(new
	                     InputStreamReader(System.in)); 
	        } 
	  
	        String next() 
	        { 
	            while (st == null || !st.hasMoreElements()) 
	            { 
	                try
	                { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken(); 
	        } 
	  
	        int nextInt() 
	        { 
	            return Integer.parseInt(next()); 
	        } 
	  
	        long nextLong() 
	        { 
	            return Long.parseLong(next()); 
	        } 
	  
	        double nextDouble() 
	        { 
	            return Double.parseDouble(next()); 
	        } 
	  
	        String nextLine() 
	        { 
	            String str = ""; 
	            try
	            { 
	                str = br.readLine(); 
	            } 
	            catch (IOException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	            return str; 
	        } 
	    } 
	  

}
