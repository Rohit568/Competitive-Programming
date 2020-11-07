package cses;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		if(n == 1)
			System.out.println(1);
		else if(n<= 3)
			System.out.println("NO SOLUTION");
		
		else
		{
			StringBuilder str = new StringBuilder("");
			
				int flag = 1; 
				for(int i = 5 ; i<=n; i+=2)
				{
					str.append(i).append(" ");
				}
				str.append("2 4 1 3 ");
				for(int i = 6; i<=n; i+=2)
				{
					str.append(i).append(" ");
				}
				System.out.println(str);
			
		}

	}

}
