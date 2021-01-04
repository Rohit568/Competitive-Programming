package virtualcontests;

import java.util.*;
public class FileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String  str = sc.next();
		int count =0;
		int ans = 0;
		int flag = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'x')
			{
				count++;
				//System.out.print(" "+ count);
			}
			else
			{
				if(count >= 3)
				{
					ans = ans + (count - 2);
				}
				count = 0;
				
				if(i == str.length() -1)
				{
					flag = 1;
				}
			}
			
			if(i == str.length()-1  && count >= 3 && flag == 0)
			{
				ans = ans + count-2;
			}
		}
		System.out.println(ans);
	}
}
