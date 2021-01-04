package Concepts;

import java.util.PriorityQueue;
import java.util.Scanner;

public class OptimalSearchPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<n;i++)
		{
			pq.add(sc.nextInt());
		}
		int cost = 0;
		while(!pq.isEmpty())
		{
			if(pq.size()==1)
				pq.remove();
			else
			{
				 int a = pq.poll();
				 int b = pq.poll();
				 cost = cost + a+b;
				 pq.add(a+b);
				 
			}
					
		}
		
		
		System.out.println(cost);

	}

}
