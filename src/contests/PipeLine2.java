package contests;

import java.util.HashMap;
import java.util.Scanner;

public class PipeLine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int sum = (k * (k + 1))/2 -1;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		int sum2 = 0;
		int steps = 0;
		
		for(int i=2; i<=k; i++)
		{
			sum2 = sum2 + i;
			int ans= sum2 - steps;
			steps++;
			hm.put(ans,steps);
			hm.put(i, 1);
		}
		
		if(hm.containsKey(n))
		{
			System.out.println(hm.get(n));
		}
		else
		{
			System.out.println(-1);
		}
		
		System.out.print(hm);
		
		

	}

}
