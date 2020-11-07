package Sheet;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



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
		    
			StringBuilder start = new StringBuilder(".........");
			boolean player = false;
			Queue<Pair<StringBuilder, Boolean>> qu = new LinkedList<>();
			
			qu.add(new Pair(start, player));
			String ans = "no";
			while(!qu.isEmpty())
			{
				Pair t = qu.peek();
				StringBuilder s = (StringBuilder)t.getKey();
				boolean pr = (boolean)t.getValue();
				qu.poll();
				
				System.out.println(s.toString()+"1");
				
				if(isWin(s.toString()))
					 continue;
					
				if(board.equals(s.toString()));
				{
				 ans = "yes";
				
				}
				
				
				for(int i=0; i<9; i++)
				{
					if(s.charAt(i)=='.')
					{
						System.out.println(s);
						s.setCharAt(i,pr?'o':'x');
						pr = pr^true;
						System.out.println(s);
						if(s.charAt(i) == board.charAt(i))
						{
						qu.add(new Pair(s, pr));
						}
						s.setCharAt(i, '.');
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

