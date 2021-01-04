package virtualcontests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AlmostAirthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc =new FastReader();
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		int ar[] = {-1 , 0, 1};
		int finalAns =  Integer.MAX_VALUE;
		
		if(n <= 2)
			System.out.println(0);
		else {
		for(int i = 0; i<3; i++)
		{
			for(int j =0; j<3; j++)
			{
				int a1 = arr[0] + ar[i];
				int b1 = arr[1] + ar[j];
				int cnt = Math.abs(ar[i]) + Math.abs(ar[j]);
				int prev = b1;
				int diff = b1-a1;
				for(int k  = 2; k<n; k++)
				{
					int next = prev + diff;
					if(Math.abs(next - arr[k]) == 1)
						cnt++;
					else if(Math.abs(next - arr[k]) > 0) {
						cnt = Integer.MAX_VALUE;
					    break;
					}
					prev = next;
				}
				finalAns = Math.min(cnt, finalAns);
			}
		}
			
			
		
		
		System.out.println(finalAns == Integer.MAX_VALUE? -1 : finalAns);
		
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
