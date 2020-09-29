package arraysandstring;

class Pair{
	int a, b;
	Pair(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}
public class FindMinimumRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {2, 3, 4, 8, 10, 15};
		int []b = {1, 5, 12};
		int []c = {7, 8, 15, 16};
		
	
		int arr[] = findingminimumrange(a, b, c);
		
		System.out.println(arr[0]+ " " + arr[1]);

	}

	public static int[] findingminimumrange(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		
		
		int diff = Integer.MAX_VALUE;
		int i=0,j = 0,k =0;
		int ans[] = new int[2];
		
		while(i< a.length && j < b.length && k < c.length)
		{
			int low = Math.min(Math.min(a[i], b[j]), c[k]);
		    int high = Math.max(a[i], Math.max(b[j], c[k]));
		    
		   
		    
		    //System.out.println(low +" "+ high);
		    
		    if(diff> (high - low))
		    {
		    	ans[0] = low;
		    	ans[1] = high;
		    
		    	diff = high - low;	
		    }
	
		    if(low == a[i])
		    	i++;
		    else if(low == b[j])
		    	j++;
		    else
		    	k++;
		}
		return ans;
	}

}
