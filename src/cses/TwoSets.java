package cses;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class TwoSets {

	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = sc.nextInt();
		
		long res = n*(n+1)/2;
		ArrayList<Long> list = new ArrayList<>();
		ArrayList<Long> list2= new ArrayList<>();
 		if(res%2==1)
			bf.write("NO" +"\n");
		else
		{
			bf.write("YES"+ "\n");
			
			res = res/2;
			
			while(n>=1)
			{
				if(res - n >= 0)
				{
					list.add(n);
				    res = res - n;
				}
				else
					list2.add(n);
				
				n--;
			}
			bf.write(list.size() + "\n");
		 for(long i : list)
				bf.write(i + " ");
			bf.write("\n");
		    bf.write(list2.size() + "\n");
			for(long i : list2)
			bf.write(i + " ");
		   
		}
 		
 		bf.close();

	}

}
