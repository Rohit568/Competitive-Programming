package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MonkandIslandProblemBFS {

	  public static int BFS(int src, ArrayList<ArrayList<Integer>> graph, boolean vis[], int dist[], int N)
	    {
	        vis[src] = true;
	        dist[src] = 0;

	        Queue<Integer> q = new LinkedList<>();

	        q.add(src);

	        while(!q.isEmpty())
	        {
	            int curr = q.remove();

	            for(int child : graph.get(curr))
	            {
	                if(vis[child] != true){
	                vis[child] = true;
	                q.add(child);
	                dist[child] = dist[curr] + 1;
	                }
	                
	            }
	        }

	        return dist[N];
	    }
	    public static void main(String args[] ) throws Exception     {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	        int test = Integer.parseInt(bf.readLine());

	        while(test-->0)
	        {
	            String str[] = bf.readLine().split(" ");
	             int N = Integer.parseInt(str[0]);
	             int M = Integer.parseInt(str[1]);

	             ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	             for(int i=0; i<=N; i++)
	             {
	                 graph.add(new ArrayList());
	             }

	             for(int i=0; i<M; i++)
	             {
	                 String str1[] = bf.readLine().split(" ");
	                 int x = Integer.parseInt(str1[0]);
	                 int y = Integer.parseInt(str1[1]);

	                 graph.get(x).add(y);
	                 graph.get(y).add(x);
	             }
	             
	              boolean vis[] = new boolean[N+5];
	              int dist[] = new int[N+7];
	             int res = BFS(1, graph, vis, dist, N);

	             System.out.println(res);

	        }
	    

	    }
}
