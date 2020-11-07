package contests;


import java.util.Scanner;

public class GiftGive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n+1];
		for(int i=1; i<n+1; i++)
		{
			int t = sc.nextInt();
			arr[t] = i;
		}
		
		for(int i=1; i<=n; i++)
			System.out.print(arr[i] + " ");
		
		
      
	}
}
