package Sheet;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;


class Pair
{
	String first;
	boolean second;
	Pair(String first, boolean second)
	{
		this.first = first;
		this.second = second;
	}
	
}
public class TicTacToe1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		while(test-->0)
		{
			String board= "";
			
			for(int i=0; i<3; i++) {
				String s = sc.next();
				board = board + s;
			}
		
			
			ArrayDeque<Pair> q = new ArrayDeque<>();
			String start = ".........";
			//StringBuilder sb = new StringBuilder(start);
		    Pair p = new Pair(start, true);
		    
		    
		    q.addLast(p);
		    
		    String ans = "no";
		    while(!q.isEmpty())
		    {
		       Pair s=  q.pollFirst();
		       String cur = s.first;
		       boolean player = s.second;
		       
		       System.out.println(cur.toString().substring(0,3) + "\n" + cur.toString().substring(3, 6) + "\n" + cur.toString().substring(6, 9)+"\n");
	    	    
		       
		       if(board.equals(cur)) {
		    	   ans = "yes";
		    	   break;
		       }
		       
		       if(isWin(cur))
		       continue;
		       
		       
		       for(int i=0; i<9; i++)
		       {
		    	   if(cur.charAt(i)== '.')
		    	   {
		    		   
		    		   //char c = player?'x':'';
		    		   StringBuilder sb = new StringBuilder(cur);
		    		   sb.setCharAt(i, player?'x':'o');
		    		   System.out.println(sb.toString().substring(0,3) + "\n" + sb.toString().substring(3, 6) + "\n" + sb.toString().substring(6, 9)+"\n");
		    	      if(cur.charAt(i) == board.charAt(i)) {
		    		     q.addLast(new Pair(sb.toString(), player^true));
		    	      }
		    	     // System.out.println(cur.toString().substring(0,3) + "\n" + cur.toString().substring(3, 6) + "\n" + cur.toString().substring(6, 9)+"\n");
		    	      sb.setCharAt(i,'.');
		    	   }
		    	   
		       }
		       
		    }
		    
		    System.out.println(ans); 
		}
	}
	 
	public static boolean isWin(String board)
	{
		boolean row = 
				((board.charAt(0) !='.' )&& (board.charAt(0) == board.charAt(1)) && (board.charAt(1) == board.charAt(2)))||
				((board.charAt(3) !='.' )&& (board.charAt(3) == board.charAt(4)) && (board.charAt(4) == board.charAt(5)))||
				((board.charAt(6) !='.' )&& (board.charAt(6) == board.charAt(7)) && (board.charAt(7) == board.charAt(8)));
				
		boolean column = 
				((board.charAt(0) !='.' )&& (board.charAt(0) == board.charAt(3)) && (board.charAt(3) == board.charAt(6)))||
				((board.charAt(1) !='.' )&& (board.charAt(1) == board.charAt(4)) && (board.charAt(4) == board.charAt(7)))||
				((board.charAt(2) !='.' )&& (board.charAt(2) == board.charAt(5)) && (board.charAt(5) == board.charAt(8)));
		boolean diagonal =
				((board.charAt(0) !='.' )&& (board.charAt(0) == board.charAt(4)) && (board.charAt(4) == board.charAt(8)))||
				((board.charAt(2) !='.' )&& (board.charAt(2) == board.charAt(4)) && (board.charAt(4) == board.charAt(6)));
		
		return row || column || diagonal;
	}
	

}
