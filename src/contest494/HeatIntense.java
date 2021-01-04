package contest494;
import java.util.*;
public class HeatIntense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double prefix[] = new double[n];
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			int a = sc.nextInt();
			sum = sum + a;
			prefix[i] = sum ;
			
		}
		
		double ans = 0;
		for(int i = 0; i<=n-k; i++)
		{
			for(int j = i+k-1 ; j<n; j++)
			{
				double avg = 0;
				if(i > 0)
				{
					avg = (prefix[j] - prefix[i-1])/(j-i+1); 
					//System.out.println(prefix[j]- prefix[i-1] + " " + avg);
				}
				else
				{
					avg = prefix[j]/(j+1);
					//System.out.println(prefix[j] + " " + avg);
				}
				ans = Math.max(avg, ans);
			}
		}
		
		System.out.println(ans);
		
	}

}
