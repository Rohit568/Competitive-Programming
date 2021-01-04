package virtualcontests;


import java.util.*;
public class Mentor {

	public static void main(String[] args){
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       
       int n = sc.nextInt();
       
       int k = sc.nextInt();
       ArrayList<Integer> list = new ArrayList<>();
       HashMap<Integer , Integer> map = new HashMap<>();
      
       for(int i=0; i<n; i++) {
    	int a = sc.nextInt();
    	list.add(a);
    	map.put(i, a);
       }
       Collections.sort(list);
       HashMap<Integer, Integer> map2 =new HashMap<>();
       boolean vis[] = new boolean[n];
       for(int i=0; i<n; i++)
       {
    	   int index =Collections.binarySearch(list, map.get(i));
    	   //System.out.print(index + " ");
    	   //System.out.print(Arrays.toString(vis));
    	   while(index > 0 && (list.get(index)== list.get(index-1)))
    	   index--;
    	   //System.out.println(index);
    	   map2.put(i, index);
//    	   if(vis[index] == false)
//    	   {
//    		   map2.put(i, index);
//    		   vis[index] = true;
//    	   }
//    	   else
//    	   {
//    		   while((index < n )&& (vis[index] == true) && map.get(index)== map.get(index+1))
//    		   {
//    			   index++;
//    		   }
//    		   vis[index] =true;
//    		  map2.put(i, index);
//    	   }
//    	    
       }
       
       for(int i=0; i<k; i++)
       {
    	   int a = sc.nextInt();
    	   int b =sc.nextInt();
    	   //System.out.println(a+" " + b);
    	   if(map.get(a-1) > map.get(b-1))
    	   {
    		  
    		   map2.put(a-1, map2.get(a-1)-1 );
    		   //System.out.println("("+map2.get(a-1) + " " + map2.get(b-1));
    		   		
    	   }
    	   else if(map.get(b-1) > map.get(a-1))
    	   {
    		  map2.put(b-1, map2.get(b-1) -1);
    		  //System.out.println("("+map2.get(a-1) + " " + map2.get(b-1));
    	   }
       }
      //System.out.println(list);
      for(int i=0; i<n; i++)
    	  System.out.print(map2.get(i)+ " ");
		
	}

}
