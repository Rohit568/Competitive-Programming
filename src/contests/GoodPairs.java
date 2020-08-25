package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoodPairs {
	
	public static int lower(int C[], int key)
	{
		int low = 0;
		int high = C.length-1;
		while(low < high)
		{
			
			int mid = low + (high - low)/2;
			if(C[mid] >= key)
				high = mid;
			else
				low = mid+1;	
		}
		
		return low;
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
		int n = Integer.parseInt(bf.readLine());
		
		int A[] = new int[n];
		int B[] = new int[n];
		
		String str[] = bf.readLine().split(" ");
		String str2[] = bf.readLine().split(" ");
		for(int i=0; i<n; i++) A[i] = Integer.parseInt(str[i]);
		for(int i=0; i<n; i++) B[i] = Integer.parseInt(str2[i]);
		

		int C[] = new int[n];
		for(int i=0; i<n; i++)
		{
			C[i] = A[i] - B[i];
		}
		
		Arrays.sort(C);
		int ans = 0;
		for(int i=0; i<n; i++)
		{
			if(C[i] <= 0)
				continue;
			
			int pos = lower(C, -C[i] + 1);
			
			ans = ans + (i- pos);
			
			
		}
		
		System.out.println(ans);
		
	}

}
