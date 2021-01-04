package DynamicProgramming;

import java.util.Scanner;

public class FLCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String ans = solvelcs(s1, s2);
		System.out.println(ans);

	}
	
	public static String  solvelcs(String s1, String s2)
	{
		char c[] = s1.toCharArray();
		char d[] = s2.toCharArray();
		int lcs[][] = new int[c.length+1][d.length+1];
		for(int i = 1; i<=c.length; i++)
		{
			for(int j = 1; j<=d.length; j++)
			{
				if(c[i-1] != d[j-1])
				{
					lcs[i][j] = Math.max(lcs[i-1][j] , lcs[i][j-1]);
				}
				else
				{
					lcs[i][j] = 1 + lcs[i-1][j-1];
				}
			}
		}
		
		int index = lcs[c.length][d.length];
		char l[] = new char[index ];
		int  i = c.length; 
		int  j = d.length;
		
		while(i > 0 && j> 0)
		{
			if(c[i-1] == d[j-1])
			{
				l[index-1] = c[i-1];
				i--;
				j--;
				index--;
			}else if(lcs[i-1][j] > lcs[i][j-1])
			{
				i--;
			}else
			{
				j--;
			}
		}
		
		return new String(l);
		
	}

}
