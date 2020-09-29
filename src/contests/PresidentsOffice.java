package contests;

import java.util.HashSet;
import java.util.Scanner;

public class PresidentsOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		char c[][] = new char[n][m];
		
		char A = sc.next().charAt(0);
		for(int i=0; i<n; i++)
		{
			String str = sc.next();
			for(int j=0; j<m; j++)
			{
				c[i][j] = str.charAt(j);
			}
		}
		
		HashSet<Character> set = new HashSet<Character>();
		
		
		int count = 0;
		int ans = 0;
		for(int i=0; i<n; i++)
		{
			count = 0;
			for(int j=0; j<m; j++)
			{
				if(c[i][j] == A)
				{
					if(i-1 >= 0)
					{
						if(c[i-1][j] != '.' && c[i-1][j]!= A)
							set.add(c[i-1][j]);
							
					}
					if(i+1 < n)
					{
						if(c[i+1][j] != '.' && c[i+1][j]!= A)
							set.add(c[i+1][j]);
					}
					if(j-1 >=0)
					{
						if(c[i][j-1] != '.' && c[i][j-1]!= A)
							set.add(c[i][j-1]);
					}
					if(j+1 < m)
					{
						if(c[i][j+1] != '.' && c[i][j+1]!= A)
							set.add(c[i][j+1]);
					}
				
			}
		}
			

	}	
		System.out.println(set.size());
	}

}
