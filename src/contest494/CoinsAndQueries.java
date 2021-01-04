package contest494;

import java.util.Scanner;

public class CoinsAndQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		int arr[] = new int[32];
		
		for(int i=0; i<n;i++)
		{
			int a = sc.nextInt();
			arr[(int)(Math.log(a)/Math.log(2))]++;
		}
		for(int j = 0; j<q; j++)
		{
			
		         int  t = sc.nextInt();
		         int ans = 0;
				for(int i = 30 ; i>= 0 && t > 0; i--)
				{
					 int need = Math.min(t>>i, arr[i]);
					 ans = ans + need;
					 t = t - (1 << i) * need;
				}
				
				if(t > 0)
					ans = -1;
				System.out.println(ans);
		}
	}

}
