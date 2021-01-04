package contest494;

import java.util.*;
public class PolycarpsPacket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0; i<n; i++)
        {
        	int a = sc.nextInt();
              if(map.containsKey(a))
              {
            	  map.put(a, map.get(a) + 1);
              }
              else
              {
            	  map.put(a, 1);
              }
            
             ans  = Math.max(ans, map.get(a)); 
        }
        System.out.println(ans);
	}

}
