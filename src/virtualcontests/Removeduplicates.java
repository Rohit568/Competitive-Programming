package virtualcontests;

import java.util.Scanner;
import java.util.*;
public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		int ar[] = new int[n];
		for(int i=0; i<n; i++)
		{
			int a = sc.nextInt();
			
			if(set.contains(a))
			{
				set.remove(a);
				set.add(a);
			}
			else
				set.add(a);
		}
		System.out.println(set.size());
		for(int a : set)
			System.out.print(a + " ");
		
	}

}
