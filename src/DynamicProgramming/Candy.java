package DynamicProgramming;

public class Candy {

	public static int solve(int like[][], int N)
	{
	
		int d[] =new int[(1<<N)];
		d[(1<<N) -1] = 1;
		
		for(int mask = (1<<N) - 2 ; mask >=0;  mask--)
		{
			int temp = mask;
			
			int k = 0;
			
			while(temp>0)
			{
				k = k + temp & 1;
				temp = temp/2;
			}
		
			for(int i=0; i<N;i++)
			{
				if(like[k][i] == 1 && (mask & 1<<i) == 0)
				{
					d[mask] = d[mask | (1<<i)];
				}
			}
		}
		
		return d[0];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int like[][] = {{1,1, 1}, {1, 0, 1}, {1, 1,1}};
        
        System.out.println(solve(like,3));
        
	}

}
