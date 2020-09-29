package datastructures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MinDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		ArrayDeque<Pair<Integer, Integer>> dq= new ArrayDeque<>();
		int numberAE = 1;
		int numberRE = 0;
		int current_min = 0;
		while(true)
		{
			
			
			int flag = sc.nextInt();
			
			if(flag == 1)
			{
				int new_element = sc.nextInt();
				while(!dq.isEmpty() && dq.peekLast().first > new_element)
					dq.pollLast();
				dq.push(new Pair(new_element, numberAE));
				numberAE++;
			}
			else if(flag == 2)
			{
				if(!dq.isEmpty() && dq.peekFirst().first == numberRE)
					dq.pollFirst();
				numberRE++;
			}
			
			else {
				
				current_min = dq.peekFirst().first;
				for(Pair p : dq)
			
			{
				System.out.print("(" + p.first + " " +p.second + ")");
			}
			System.out.println("Added Element " + numberAE);
			System.out.println("Removed Element " + numberRE);
			System.out.println("currentmin " + current_min);
		}
		
		

	}
	}

}
