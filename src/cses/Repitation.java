package cses;

import java.util.Scanner;

public class Repitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		String str = sc.next();
		int i = 0;
		int max = 0;
		while(i < str.length()-1)
		{
			int k = i;
			while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
			{
				i++;
			}
			if(max < (i-k)) {
				max = i - k;
			}
			if(k == i)
				i++;
		}
		System.out.println(max+1);
	}

}
