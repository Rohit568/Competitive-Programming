package DynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//package DynamicProgramming;

public class MoneySum {
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FastReader  fr = new FastReader();
		
		int n = fr.nextInt();
		
		int arr[] = new int[n];
	    int sum = 0;
		for(int i=0;i<n; i++) {
			arr[i] = fr.nextInt();	
			sum = sum + arr[i];
		}
		 boolean dp[] = new boolean[sum + 1];
		 solve(arr,  dp, 0,  n, 0);
		 
		 int count =0;
		 StringBuilder sb = new StringBuilder("");
		 for(int i=1; i<=sum; i++)
		 {
			 if(dp[i] == true)
			 {
				 count++;
				 sb.append(i).append(" ");
			 }
		 }
		 System.out.println(count + "\n" + sb);
	
	}


	private static void solve(int[] arr, boolean[] dp, int i, int n, int ans) {
		// TODO Auto-generated method stub
		if(dp[ans] == true)
			return;
		if(i==n) {
			dp[ans] = true;
			System.out.print(ans + " ");
		}
		else
		{
			solve(arr, dp, i+1, n, ans);
			solve(arr, dp, i+1, n, ans+arr[i]);
		  
		}
	}
}
