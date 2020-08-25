package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsRearrange {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
		int test = Integer.parseInt(bf.readLine());
		
		
		while(test-->0)
		{
			int n = Integer.parseInt(bf.readLine());
			
			String str = bf.readLine();
			
			int minusCount = 0;
			int min = 0;
			int count = 0;
			for(int i=0;i <str.length(); i++)
			{
				if(str.charAt(i) ==')')
					minusCount--;
				else
					minusCount++;
				
				if(minusCount < min) {
					min = minusCount;
					count++;
				}
		
			}
			System.out.println(count);
		}
	}

}
