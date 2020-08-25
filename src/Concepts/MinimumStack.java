package Concepts;

import java.util.*;
import java.io.*;


public class MinimumStack{

    static class Pair{
        int first, second;
        Pair(int a, int b)
        {
            first = a;
            second = a;
        }
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int q = sc.nextInt();

       int arr[] = new int[n];
       for(int i=0;i<n; i++) arr[i] = sc.nextInt();

       for(int i=0; i<q; i++)
       {
           int d = sc.nextInt();
           int noOfStack  = n/d + 1;

           Stack [] stack = new Stack[noOfStack];

           for(int j=0; j<noOfStack; i++)
           stack[j] = new Stack();
           
           int t = 0; 
           for(int j=1; j<n; j++)
           {
               for(int l = j; l<l+d; l++){
               int max = stack[t].isEmpty()?arr[l]:Math.max(arr[i],stack[t].peek().second);
               stack[t].push(new Pair(arr[l], max));
               }
               j = j+d;
               t++;
           }
           int min = Integer.MAX_VALUE;
           for(int j = 0; j< noOfStack; j++)
           {
                int value = stack[j].pop().first;
                if(value < min)
                min = value;
           }
          
           System.out.println(min);
           
           
       }

    }
}