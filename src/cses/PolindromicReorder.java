package cses;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class PolindromicReorder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
	    String str = sc.nextLine();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    Map<Character, Integer> map = new HashMap<>();
	    
	    for(int i=0; i<str.length(); i++)
	    {
	    	if(map.containsKey(str.charAt(i)))
	    	{
	    		map.put(str.charAt(i), map.get(str.charAt(i))+1);
	    	}
	    	else
	    	{
	    		map.put(str.charAt(i), 1);
	    	}
	   
	    }
	    
	   
	    Set<Character> evenset =new HashSet<>();
	    Set<Character> oddset =new HashSet<>();
	    for(char i : map.keySet())
	    {
	    	int  t = map.get(i);
	    	if(t%2 == 1)
	    		oddset.add(i);
	    	else {
	    		evenset.add(i);
	    	  }
	    }
	    
	    if((str.length()%2 == 1 && oddset.size() > 1) || (str.length()%2==0 && !oddset.isEmpty()))
	    {
	    	bw.write("NO SOLUTION");
	    }
	    else 
	    {
	    	StringBuilder st = new StringBuilder("");
	    	if(str.length()%2 == 1)
	    	{
	    		
	    		for(char s : oddset)
	    		{
	    			int t = map.get(s);
	    			for(int i=0; i<t; i++)
	    			st = st.append(s);
	    		}
	    		
	    		for(char s : evenset)
	    		{
	    			int t = map.get(s);
	    			 t = t/2;
	    			 
	    			 for(int i=0; i<t; i++)
	    			 {
	    				 st = st.insert(0, s).append(s);
	    			 }
	    			
	    		}
	    	}
	    	else
	    	{
	    		for(char s : evenset)
	    		{
	    			int t = map.get(s);
	    			 t = t/2;
	    			 
	    			 for(int i=0; i<t; i++)
	    			 {
	    				 st = st.insert(0, s).append(s);
	    			 }
	    			
	    		}
	    	}
	    	
	    	bw.write(String.valueOf(st));
	    }
	    bw.close();

	}

}
