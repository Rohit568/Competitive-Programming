package virtualcontests;

import java.util.*;
import java.io.*;
public class Less_equal {

	public static void main(String args[]) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str1[] = bf.readLine().split(" ");
		int n = Integer.parseInt(str1[0]);
		int k = Integer.parseInt(str1[1]);
		
		String str[] = bf.readLine().split(" ");
		
		ArrayList<Long> list = new ArrayList<>();
		for(int i=0; i<n; i++) list.add(Long.valueOf(str[i]));	
		
		Collections.sort(list);
		
		if(k == 0)
		{
			if(list.get(0) != 1)
			{
				bw.write(list.get(0)-1 + "\n");
			}
			else 
				bw.write("-1"+"\n");
		}
		else if(n ==k  || list.get( (k-1)) != list.get(k))
		{
              bw.write(list.get(k-1)+"\n");
		}
		else
		{
			bw.write("-1"+"\n");
		}
		
	bw.close();
    }
}
