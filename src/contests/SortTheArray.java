package contests;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int arr[] = new int[n+1];
		for(int i=1; i<=n; i++) arr[i] = sc.nextInt();
		int flag = 0;
		int l = 0;
		int r = 0;
		
		for(int i=1; i<=n; i++)
		{
			if(arr[i] != i && flag == 0) {
				l = i;
				flag = 1;
			}
			else if(flag ==1 && arr[i] == i)
			{
				r = i;
				break;
			}	
		}
		
		int i = l;
		int j = r;
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		if(l == 0 && r ==0) {
			System.out.println("yes");
			System.out.println(1+" "+1);
		}
		else {
			int f = 0;
			for(int k=1; k<=n; k++)
			{
				if(arr[k] != k)
				{
					flag = 1;
					break;
				}
			}
			
			if(flag ==1)
			{
				System.out.println("no");
			}
			else
			{
				System.out.println("yes");
				System.out.println(l + " " + r);
			}
			
		}
		 
       
	}

}
