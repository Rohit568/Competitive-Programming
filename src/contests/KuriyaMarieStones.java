package contests;

import java.util.Arrays;
import java.util.Scanner;

public class KuriyaMarieStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long arr[] = new long[n];
		long prefix[] = new long[n];
		
		long pre =0;
		for(int i=0; i<n;i++)
		{
			arr[i] =sc.nextLong();
			pre = pre + arr[i];
			prefix[i] = pre;
		}
		long brr[] = arr.clone();
		Arrays.sort(brr);
		//System.out.println(Arrays.toString(brr));
		long prefix2[] = new long[n];
		pre = 0; for(int i =0; i<n; i++) { pre = pre + brr[i]; prefix2[i] = pre;}
		
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++)
		{
			int a = sc.nextInt();
			int l = sc.nextInt();
			int r = sc.nextInt();
			long ans = 0;
			if(a == 1)
			{
				ans = prefix[r-1] - prefix[l-1] + arr[l-1];
			}
			else
			{
				ans = prefix2[r-1] - prefix2[l-1] + brr[l-1];
			}
			System.out.println(ans);
		}

	}

}
