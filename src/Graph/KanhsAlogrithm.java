package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KanhsAlogrithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		int n = sc.nextInt();
		int e = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			graph.add(new ArrayList());
		}
		int indegree[] = new int[n];
		for(int i=0;i<e; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
			indegree[b]++;
		}
		for(int k : indegree) System.out.print(k+" ");
		
		Queue<Integer> q =new LinkedList<Integer>();
		int ans[] = new int[n+9];
		int s = 0;
		for(int i=0; i<n; i++)
		{
			if(indegree[i] == 0)
			{
				q.add(i);
				
				while(!q.isEmpty())
				{
					int temp= q.poll();
					ans[s] = temp;
				
					//System.out.println(temp);
					for(int es : graph.get(temp))
					{
						indegree[es]--;
						if(indegree[es] == 0)
						{
							q.add(es);
						}
					}
					s++;
					//System.out.println(q);
					
				}
			}
		}
		
		if(s ==  n-1)
		{
			for(int k : ans)
				System.out.print(k + " ");
		}
		else
		{
			System.out.print(s + " ");
			//System.out.println("It is not possible");
		}
	}

}
