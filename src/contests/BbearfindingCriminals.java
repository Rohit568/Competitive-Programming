package contests;

import java.util.Scanner;

public class BbearfindingCriminals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
	    int pos = sc.nextInt();
	    int ans = 0;
	    int count = 0;
	    int arr[] = new int[n];
	    for(int i=1; i<n; i++) {
	    	if(arr[i] == 1) {
	       int distance = i - pos;
	       int j = pos - distance;
	       if(j < 0 ||  j>n || arr[j] == arr[j])
	    	   count++;
	    	}
	    }
	    
	    System.out.println(count);

	}

}
