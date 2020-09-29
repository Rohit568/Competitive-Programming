package arraysandstring;

import java.util.HashSet;
import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<n; i++) set.add(sc.nextInt());
		
		int ans = longestConsecutiveSubsequence(set);
		
		System.out.println(ans);
		

	}

	private static int longestConsecutiveSubsequence(HashSet<Integer> set) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE;
		for(int e : set)
		{
			   if(!set.contains(e - 1))
			   {
				   int len = 1;
				   while(set.contains(e + len))
			       len++;
				   
				   max = Math.max(len, max);
				   
			   }
		}
		return max;
	}

}
