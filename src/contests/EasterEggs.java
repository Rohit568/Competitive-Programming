package contests;

import java.util.HashMap;
import java.util.Scanner;

public class EasterEggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, Character> map =new HashMap<>();
		
		map.put(0, 'R');
		map.put(1, 'O');
		map.put(2, 'Y');
		map.put(3, 'G');
		map.put(4, 'B');
		map.put(5, 'I');
		map.put(6, 'V');
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String ans = "";
		
		for(int i=0; i<n; i++)
		{
			if(i < 7)
		    ans = ans  + map.get(i%7);
			else
			{
				if(i%7 <=3)
					ans = ans  + map.get(i%7 + 3);
					else 
						 ans = ans + map.get(i%7-1);
			}
		}
		
		System.out.println(ans);
		
	}

}
