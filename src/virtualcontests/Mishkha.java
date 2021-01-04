package virtualcontests;
import java.util.*;
public class Mishkha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int k =sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) arr[i] =sc.nextInt();
		
		int i = 0;
		int j  = n-1;
		int cnt = 0;
		while(i <= j)
		{
			if(arr[i] <= k)
			{
				cnt++;
				i++;
			}
			else if(arr[j] <= k)
			{
				cnt++;
				j--;
			}
			else
				break;
          
		}
		
		System.out.println(cnt);
		

	}

}
