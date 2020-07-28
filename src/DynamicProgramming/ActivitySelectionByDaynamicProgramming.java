package DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionByDaynamicProgramming {
	
	static class myComparator implements Comparator<Timing>{
		public int compare(Timing s, Timing t)
		{
			return s.a - t.a;
		}
	}
	
	public static int solution(Timing time[])
	{
		int ans[] = new int[12];
		
		int count = 0;
		int max = 0;
		ans[0] = 1;
		for(int i=1; i<12; i++)
		{
			ans[i] = 1;
			for(int j = i-1; j>=0; j--)
			{
				if(time[i].a >= time[j].b)
				{
	               ans[i] = ans[i] + ans[j];
	               break;
				}
			}
			
			if(max <=  ans[i])
				max = ans[i];
			
		}
		return max;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timing[] time= new Timing[12];
	
		time[0] = new Timing(1, 2); 
		time[1] = new Timing(3, 5); 
		time[2] = new Timing(2, 12);
		time[3] = new Timing(0, 6); 
		time[4] = new Timing(5, 7); 
		time[5] = new Timing(3, 8); 
		time[6] = new Timing(5, 9); 
		time[7] = new Timing(6, 10); 
		time[8] = new Timing(8, 11); 
		time[9] = new Timing(8, 12); 
		time[10] = new Timing(2, 13); 
		time[11] = new Timing(12, 14); 
		
		
		Arrays.sort(time, new myComparator());
		
		for(int i = 0; i<time.length; i++)
		{
			System.out.println(time[i].a+" "+time[i].b);
		}
		System.out.println(solution(time));
		
		
	}

}

class Timing{
	int a;
	int b;
	Timing(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}
