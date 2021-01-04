package contest494;
import java.util.*;
public class TreeConstructing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        int deg[] = new int[n+8];
        int di =d;
        int dis[] = new int[n+8];
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++) 
        	graph.add(new ArrayList());
        int t = 1;
        int st = 1;
        int end = d+1;
        int flag = 0;
        int edgeCount = d;
       
        if(n < d)
        {
        	System.out.println("NO");
        	flag = 1;
        }
        if(flag == 0) {
        for(int i= 0; i<d; i++)
        {
        	graph.get(t).add(t+1);
        	deg[t]++;
        	deg[t+1]++;
        	dis[t] = Math.max(t - st, end - t);
        	dis[t+1] = Math.max(t + 1 - st, end -(t+1));
        	if(deg[t] > k || deg[t+1]> k)
        	{
        		System.out.println("NO");
        		flag = 1;
        		break;
        	}
        	t++;
        		
        }
        }
        
        if(flag  == 0)
        {
        	//while(t < n && edgeCount < n-1) { 
        	for(int i= 2; i<n; i++)
        	{
        		while(deg[i] >= 1 && deg[i] < k && dis[i] < d && edgeCount < n-1)
        		{
        			t++;
        			graph.get(i).add(t);
        			deg[i]++;
        			deg[t]++;
        			dis[t] = dis[i] +1;
        			edgeCount++;
        		}
        		
        	}
        	//}
        	
        	if(edgeCount == n-1)
        	{
        		System.out.println("YES");
        		for(int i = 1; i<=n;i++)
        		{
        			for(int a : graph.get(i))
        			{
        				System.out.println(i + " " + a);
        			}
        		}
        	}
        	else
        	{
        		System.out.println("NO");
        	}
        	
        }
        	
       
	}

}
