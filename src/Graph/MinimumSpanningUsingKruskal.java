package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumSpanningUsingKruskal {
	
	
	
	static class Ggraph{
		int vertices;
		ArrayList<Edge>  allEdge = new ArrayList<>();
		Ggraph(int a){
			
			this.vertices = a;
			
		}
		
		
		public void addEdge(int source, int destination , int weight)
		{
			Edge edge = new Edge(source, destination, weight);
			allEdge.add(edge);
		}
		
		
		public void kruskalMst()
		{
			  PriorityQueue<Edge> pq = new PriorityQueue<Edge>(allEdge.size(), new myComparator());
				
			  for(int i=0; i<allEdge.size(); i++)
			  {
				  
				  pq.add(allEdge.get(i));
			  }
			  
			  int parent[] = new int[vertices];
			  
			  makeSet(parent);
			  
			  ArrayList<Edge> mst = new ArrayList<>();
			  
			   int index = 0;
			   
			   while(index < vertices - 1)
			   {
				   Edge edge2 = pq.remove();
				   
				   int x_set = find(parent, edge2.source);
				   int y_set = find(parent, edge2.destination);
				   
				   if(x_set== y_set)
					   continue;
				   
				   mst.add(edge2);
				   index++;
				   union(parent, x_set, y_set);  
				   
			   }	
			   
			   System.out.println("MinimumSpanningTreeis");
			   printGraph(mst);
		}


		public void addEgde(int i, int j, int k) {
			// TODO Auto-generated method stub
			
		}
	}
	
	    public static void printGraph(ArrayList<Edge> mst)
	    {
	    	for(int i=0; i<mst.size(); i++)
	    	{
	    		Edge edge = mst.get(i);
	    		
	    		System.out.println(edge.source + " " + edge.destination + " " + edge.weight);
	    	}
	    }
		
		public static void makeSet(int a[])
		{
			for(int i=0; i<a.length; i++)
				a[i] = i;
		}
		
		public static int find(int parent[], int vertex )
		{
			if(parent[vertex]!=vertex)
			{
				find(parent, parent[vertex]);
			}
			return vertex;
		}
		
		public static void union(int parent[], int x, int y)
		{
			int x_set  = find(parent, x);
			int y_set = find(parent, y);
		    parent[y_set] = x_set;
		}
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vertices = 6;
        Ggraph graph = new Ggraph(vertices);
        graph.addEgde(0, 1, 4);
        graph.addEgde(0, 2, 3);
        graph.addEgde(1, 2, 1);
        graph.addEgde(1, 3, 2);
        graph.addEgde(2, 3, 4);
        graph.addEgde(3, 4, 2);
        graph.addEgde(4, 5, 6);
        graph.kruskalMst();

	}

}


class Edge{
	
	int source;
	int destination;
	int weight;
	
	Edge(int a, int b , int c)
	{
		this.source = a;
		this.destination = b;
		this.weight = c;
	}
}

class myComparator implements Comparator<Edge>{
      public int compare(Edge E, Edge F)
      {
    	  return E.weight - F.weight;
      }
}


