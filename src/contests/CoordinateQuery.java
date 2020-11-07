package contests;

import java.util.*;



 class CoordinateQuery {
	
	static class MyComparator implements Comparator<Desc>{
		 
		 public int compare(Desc a, Desc b) {
		 return a.sortby - b.sortby;
		 }
	 }

 public static void main(String args[] ) throws Exception {
     
     Scanner sc = new Scanner(System.in);
    
     int n = sc.nextInt();
     int query = sc.nextInt();

     PriorityQueue<Desc> qu = new PriorityQueue<>(10, new MyComparator());
     int sum = 0;
     
     while(query-->0)
     {
         int mode = sc.nextInt();
        
         if(mode==1)
         {
             int x = sc.nextInt();
             int y = sc.nextInt();
             int z = sc.nextInt();
             int val = sc.nextInt();
             sum = sum + val;
             
             
             qu.add(new Desc(x, y, z, val));
         }
         else
         {
             
             int a = sc.nextInt();
             int b = sc.nextInt();
             int c= sc.nextInt();
             int A = sc.nextInt();
             int B = sc.nextInt();
             int C = sc.nextInt();
             int valt = 0;
             for(Desc pr : qu)
             {
                 int x = pr.x;
                 int y = pr.y;
                 int z = pr.z;

                 if((a<=x && x<=A) && (b<=y && y<=B) &&(c<=z && 
                 z<=C))
                 {
                     valt = valt + pr.val;
                 }
                 else
                	 break;
             }

             System.out.println(sum - valt);
         }
         
         for(Desc d : qu )
         {
        	 System.out.println(d.x + " " + d.y + " " + d.z + " ");
         } 
     }
   }
 }
 

 class Desc{
     int x,y,z, val;

     Desc(int x , int y, int z, int val)
     {
         this.x = x;
         this.y = y;
         this.z = z;
         this.val = val;
     }

     int max = Math.max(x, Math.max(y, z));
     int min = Math.min(x, Math.min(y, z));

     int sortby = max - min;
    
    
 }

 


/*
10 6
1 0 0 6 6
1 9 9 9 10
1 8 5 9 5
2 3 4 5 9 10 9
1 6 6 1 23
2 0 0 0 8 9 10
*/
