package virtualcontests;
import java.util.*;
public class AlphabeticalRemovals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String str = sc.next();
		
		char c[] = str.toCharArray();
		int cnt[] = new int[26];
		
		for(int i= 0; i<n; i++)
		{
			cnt[c[i]- 'a']++;
		}
		int pos = 26;
		for(int i=0; i<n; i++)
		{
			if(k >= cnt[i])
		     k = k - cnt[i];
			else
			{
				pos = i;
				break;
			}
		}
		int rem  = k;
		String  ans = "";
		for(int i=0; i<n; i++)
		{
			int curr = str.charAt(i) - 'a';
			
			if(curr > pos ||(curr == pos && rem == 0 ))
					{
				         ans = ans + str.charAt(i);
					}
			else if(curr == pos)
			{
				rem--;
			}
		}
		System.out.println(ans);
		
		
			
		
	}
}