package virtualcontests;
import java.util.*;
public class ReversingEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	    String str = sc.next();
	   
	    StringBuilder sb = new StringBuilder(str);
	    //sb =sb.reverse();
	     
	    ArrayList<Integer> factors = new ArrayList<Integer>();
	   
	    
	    solveFactor(factors, n);
	    factors.add(n);
	    Collections.sort(factors);
	    
	    for(int i = 0; i < factors.size(); i++)
	    {
	    	String tr = sb.substring(0, factors.get(i));
	        StringBuilder st = new StringBuilder(tr);
	        st = st.reverse();
	        String sl = new String(st);
	        sb = sb.replace(0, factors.get(i), sl);
	       // System.out.println(sb.toString());	
	    }
	   // System.out.println(factors);
	    System.out.println(sb.toString());    
	}
	
	public static void solveFactor(ArrayList<Integer> factors, int n)
	{
		for(int i=2; i*i<=n; i++)
		{
			if(n%i ==0)
			{
				if(i != n/i) {
				factors.add(i);
				factors.add(n/i);
				}
				else
				{
					factors.add(i);
				}
			}
		}
	}

}
