package datastructures;

import java.util.Scanner;
import java.util.Stack;


public class MinimumStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<Pair<Integer, Integer>> min_stq= new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n; i++)
		{
			int flag = sc.nextInt();
			if(flag == 1)
			{
			int new_element = sc.nextInt();
			
			int new_min = min_stq.isEmpty() ? new_element : Math.min(min_stq.peek().second, new_element);
			
			min_stq.push(new Pair(new_element, new_min));
			}
			else
			{
				int removed_element = min_stq.pop().first;
				System.out.println(removed_element);
			}
			
			int current_min  = min_stq.peek().second;
			System.out.println(current_min);
			
		}
		
		

		
		
		
		

	}

}
