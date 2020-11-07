package Graph;

import java.util.ArrayList;
import java.util.Scanner;

class Node{
	int des, wt;
	Node(int d, int w){
		this.des = d;
		this.wt  = w;
	}
	
	
}
public class PrimsAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner  sc = new Scanner(System.in);
		   
		   int noOfEdges =sc.nextInt();
		   
		   ArrayList<ArrayList<Node>>  g = new ArrayList<>();
		   
		   for(int i=0; i<noOfEdges; i++)
		   {
			   int a = sc.nextInt();
			   int b = sc.nextInt();
			   int w = sc.nextInt();
			   makeEdge(g, a, b, w);
		   }
		   
		   int curWt[] = new int[noOfEdges];
		   
		   
		   
		   
	}
	
	public static void makeEdge(ArrayList<ArrayList<Node>> list, int a, int b, int w)
	{
		list.get(a).add(new Node(b, w));
		list.get(b).add(new Node(a, w));
	}

}
