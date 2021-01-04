package virtualcontests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class UniqueBidAuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0)
		{
			HashMap<Integer, Integer> map = new HashMap<>();
			
			int n = sc.nextInt();
			int min = Integer.MAX_VALUE;
			int k = 0;
			int index = -1;
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			while(n-- > 0)
			{
				int a = sc.nextInt();
				k++;
				if(map.containsKey(a))
				{
					pq.remove(a);
				}
				else
				{
					map.put(a, k);
					pq.add(a);
				}
			}
			
		    if(pq.isEmpty())
		    	System.out.println(-1);
		    else
		    	System.out.println(map.get(pq.poll()));
			
		}

	}

}
