package contests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Polindrome {
    
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		
		StringBuilder sb = new  StringBuilder(str);
		
		StringBuilder ans = sb.reverse();
		System.out.println(sb.append(ans));	
	}

}
