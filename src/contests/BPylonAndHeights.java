package contests;

import java.util.Scanner;

public class BPylonAndHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int  n= sc.nextInt();
		
		int energy = 0;
		int x = 0;
		
		int res =0;
		for(int i=1; i<=n;i++)
		{
			int y = sc.nextInt();
			
			energy = energy + x - y;
			
			if(energy < 0)
			{
				res  = res -energy;
				energy = 0;
			}
			
			x = y;
			
		}
		

	}

}
