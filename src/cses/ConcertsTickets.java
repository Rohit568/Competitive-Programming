package cses;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ConcertsTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer>  list  = new ArrayList<Integer>();
		
	    for(int i=0; i<n; i++) list.add(sc.nextInt());
	    StringBuilder sb = new StringBuilder("");
	    Collections.sort(list);
	    boolean vis[] = new boolean[n];
	    for(int i=0; i<m; i++)
	    {
	    	int a = sc.nextInt();
	    	int min = Integer.MAX_VALUE;
	    	int res = UpperBound(list, a);
	    	
	    	if(res== 0 && a <list.get(res))
	    	{
	    	    sb.append("-1").append("\n");
	    	   
	    	}else
	    	{
	    	sb.append(list.get(res) +"").append("\n");
	    	list.remove(res);
	    	}
	       
	    }
	    System.out.println(sb);

	}

	static int UpperBound(ArrayList<Integer> a, int x) {// x is the key or target value
	    int l=-1,r=a.size();
	    while(l+1<r) {
	       int m=(l+r)>>>1;
	       if(a.get(m)<=x) l=m;
	       else r=m;
	    }
	    return l+1;
	 }

}
