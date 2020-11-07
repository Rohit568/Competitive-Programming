package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
public class Apartments {
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
       
		
		FastReader sc = new FastReader();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		ArrayList<Integer> stu = new ArrayList<>();
		ArrayList<Integer> apa = new ArrayList<>();
		for(int i=0;i<n; i++) stu.add(sc.nextInt());
		for(int i =0; i<m; i++) apa.add(sc.nextInt());
		Collections.sort(stu);
	    Collections.sort(apa);
//		int j =0;
//		int count = 0;
//		System.out.println(Arrays.toString(stu) + " \n"+ Arrays.toString(apa));
//		for(int i=0; i<n; i++)
//		{
//			if( (j< m)&&(stu[i]>= apa[j]-k) && (stu[i] <= apa[j] + k))
//			{
//				count++;
//				
//				System.out.println(stu[i] + " allotted " +apa[j]);
//				j++;
//			}
//			else
//			{
//				if(j < m && stu[i] < apa[j])
//				{
//					
//				}
//				else
//				{
//					while(j<m && stu[i]> apa[j])
//					{
//						j++;
//					}
//					if( (j< m)&&(stu[i]>= apa[j]-k) && (stu[i] <= apa[j] + k))
//					{
//						count++;
//						
//						System.out.println(stu[i] + " allotted " +apa[j]);
//						j++;
//					}
//				}
//			}
//		}
		
		int i =0;
		int j = 0;
		int count = 0;
		while(i< n && j<m)
		{
			if((apa.get(j) - k) <= stu.get(i) && (apa.get(j) +k)>= stu.get(i))
			{
				count++;
				j++;
				i++;
			}
			else if((apa.get(j) - k) < stu.get(i))
			{
				j++;
			}
			else if((apa.get(j)+ k) > stu.get(i))
			{
				i++;
			}
		}
		System.out.println(count);
	}

}
