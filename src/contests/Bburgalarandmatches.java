package contests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bburgalarandmatches {
	
	static class Match implements Comparable<Match>{
		int matchBox;
		int matches;
	
		Match(int a, int b)
		{
		    this.matchBox  = a;
		    this.matches = b;
		  
		}
		
		public int compareTo(Match m1)
		{
			return (int) (m1.matches - this.matches);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ArrayList<Match> list = new ArrayList<>();
		
		for(int i=0;i<m; i++)
		{
			int a = sc.nextInt();
			int b=  sc.nextInt();
			list.add(new Match(a, b));
		}
		Collections.sort(list);
		int ans = 0;
		
		for(Match s : list)
		{
		     if(s.matchBox < n)
		     {
		    	 ans = ans +  s.matchBox * s.matches;
		    	 n = n - s.matchBox;
		     }
		     else
		     {
		    	 ans = ans + s.matches * n;
		    	 break;
		     }
		}
		System.out.println(ans);
	}

}
