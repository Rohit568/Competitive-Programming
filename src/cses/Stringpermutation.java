package cses;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Stringpermutation {
	static TreeSet<String>  strset = new TreeSet<>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Scanner sc = new Scanner(System.in);
	   
	   String str = sc.nextLine();
	   generateAllPermutation(0, str.length()-1, str);
	   Iterator itr = strset.iterator();
	   System.out.println(strset.size());
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }

	}

	private static void generateAllPermutation(int i, int length, String str) {
		// TODO Auto-generated method stub
		
		if(i==length)
		{
		    strset.add(str );
		}
		else
		{
			for(int j = i; j<= length; j++)
			{
				str = swap(str, i , j);
				generateAllPermutation( i+1, length, str);
				str = swap(str, i, j);
				
			}
		}
		
	}
	 
	public static String swap(String str, int i ,int  j)
	{
		char[] c = str.toCharArray();
		
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		
		return String.valueOf(c);
	}
	

}
