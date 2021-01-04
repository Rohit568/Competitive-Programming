package virtualcontests;
import java.util.*;
import java.io.*;
public class EquilizeTheRemainders {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		
	    String str[] = bf.readLine().split(" ");
	    String st[] = bf.readLine().split(" ");
	    
	    int n = Integer.parseInt(str[0]);
	    int m= Integer.parseInt(str[1]);
	    long arr[] = new long[n];
	    
	    ArrayList<LinkedList<Integer>> list = new ArrayList<>();
	    for(int i=0; i<m; i++)
	    {
	    	list.add(new LinkedList<>());
	    }
	    for(int i=0; i<n; i++)
	     {
	    	 arr[i] = Integer.parseInt(st[i]);
	    	 
	    	 list.get((int)arr[i]%m).add(i);
	    	 
	     }
//	    for(LinkedList<Integer> s : list)
//	    {
//	    	System.out.println(s);
//	    }
	    int k = n/m;
	    int ans = 0;
	    LinkedList<Pair> free = new LinkedList<>();
	    for(int i=0; i<m*2; i++)
	    {
	    	int cur = i%m;
	    	
	    	while(list.get(cur).size() > k)
	    	{
	    		int get = list.get(cur).removeLast();
	    		free.add(new Pair(get, i));
	    	}
	    	
	    	while(list.get(cur).size() < k && !free.isEmpty())
	    	{
	    		Pair p = free.removeLast();
	    	    int ele = p.first;
	    		int mmod = p.second;
	    		list.get(cur).add(ele);
	    		arr[ele] = arr[ele]  + (i - mmod);
	    		ans = ans + (i-mmod);
	    	}
	    }
//	    for(LinkedList<Integer> s : list)
//	    {
//	    	System.out.println(s);
//	    }
	    System.out.println(ans);
	    for(long a: arr)
	    System.out.print(a + " ");
				
	}

}

 class Pair{
    int first;
    int second;
    
    Pair( int first, int second)
    {
    	this.first = first;
    	this.second =second;
    }
	
}
