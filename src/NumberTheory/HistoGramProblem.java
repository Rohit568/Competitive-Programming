package NumberTheory;

import java.util.Scanner;
import java.util.Stack;

public class HistoGramProblem {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
		  
		  int noOfIngots = sc.nextInt();
		  
		  int  breadth = sc.nextInt();
		  
		  int hieght = sc.nextInt();
		  
		  int lengthArr[] = new int[noOfIngots];
		  int lengthSum = 0;
		  for(int i=0; i<noOfIngots; i++) {
			   lengthArr[i] = sc.nextInt();
			   lengthSum = lengthSum + lengthArr[i]; 
		  }
		  
		  int totalVolume = breadth * hieght * lengthSum;
		  
		  int maxArea = Solution(lengthArr, noOfIngots);
		  
		  
		  int result = totalVolume - (maxArea * breadth * hieght);
		  
		   System.out.println(result);	  

	}

	private static int Solution(int[] lengthArr, int noOfIngots) {
		// TODO Auto-generated method stub
		
		Stack<Integer> indexStack =new Stack<>();
		int maxArea = Integer.MIN_VALUE;
		int area = 0;
		int top = 0 ;
		
		int i=0;
		
		while(i<noOfIngots)
		{
			  if(indexStack.isEmpty() || lengthArr[indexStack.peek()] <= lengthArr[i])
			  {
				  indexStack.push(i++);
			  }
			  else
			  {
				  top = indexStack.peek();
				  indexStack.pop();
				  
				  area = indexStack.isEmpty()? lengthArr[top]* i:lengthArr[top] *(i - indexStack.peek() - 1);
				  
				  if(maxArea < area)
					  maxArea = area;
				  
			  }
				  
		}
		
		while (indexStack.empty() == false) 
        { 
            top = indexStack.peek(); 
            indexStack.pop(); 
            area = lengthArr[top] * (indexStack.empty() ? i : i - indexStack.peek() - 1); 
       
            if (maxArea < area) 
                maxArea = area;
        } 
       
        return maxArea; 
				
	}

}
