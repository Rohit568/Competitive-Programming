package NumberTheory;
import java.util.*;
public class TotalDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	Set<Integer> list[] = new HashSet[10000000];
	
	for(int i=0; i<1000000; i++)
		list[i] = new HashSet<>();
		
		for(int i=2; i<1000000; i++)
		{
			  
				for(int j=i; j*j< 1000000; j+=i)
				{
					list[j].add(i);
				}
				
		}
		
		System.out.print(list[2004]);

	}

}
