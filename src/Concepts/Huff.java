package Concepts;
import java.util.*;
public class Huff {
	char c;
    int n ;
    Huff left = null, right = null;

	 public static void main(String args[]){
		    
	      Scanner sc = new Scanner(System.in);
	      int test = sc.nextInt();
	      while(test-->0)
	      {
	         String s = sc.nextLine();
	         int arr[] = new int[s.length()];
	         for(int i=0;i<s.length(); i++ ) arr[i] = sc.nextInt();
	         PriorityQueue<Huff> pq = new PriorityQueue<>(new MyComparator() );
	         for(int i=0; i<s.length(); i++)
	         {
	             Huff hf = new Huff();
	             hf.c = s.charAt(i);
	             hf.n = arr[i];
	             hf.left = hf.right = null;
	             
	             pq.add(hf);
	         }
	         
	         Huff root = null;
	         while(!pq.isEmpty()){
	             Huff x = pq.peek();
	             pq.poll();
	             Huff y = pq.peek();
	             pq.poll();
	             Huff fs = new Huff();
	             fs.n = x.n + y.n;
	             fs.left = x;
	             fs.right = y;
	             root = fs;
	             pq.add(fs);
	         }
	         
	         printCode(root , "");
	         
	      }
	    }

	    
	    public static void printCode(Huff root, String str)
	    {
	        if(root.left == null && root.right==null)
	        {
	            System.out.println(root.c + ": " + str);
	            return;
	        }
	        printCode(root.left, str +"0");
	        printCode(root.right, str + "1");
	        
	    }
	    
	    
	    
	      
	 }
	 
	 class MyComparator implements Comparator<Huff>{
	     public int compare(Huff a, Huff b){
	     return a.n - b.n;
	     }
	 }
	
	 
