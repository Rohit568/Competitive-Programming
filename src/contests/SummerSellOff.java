package contests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SummerSellOff {

	
	static class Product implements Comparable<Product>{
		
		int sell, persons;
		int calc;
		
		Product(int a, int b)
		{
			this.calc = Math.min(2*a ,b);
			this.sell = a;
			this.persons = b;
		}
		
		public int compareTo(Product a)
		{
		    return a.calc - this.calc;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int ddays = sc.nextInt();
		
		ArrayList<Product> list = new ArrayList<>();
		
		for(int i=0; i<days; i++)
		{
			int a = sc.nextInt();
			int b =sc.nextInt();
			list.add(new Product(a, b));
		}
		
		Collections.sort(list);
		int i= 0;
		int sum = 0;
		for(Product c : list)
		{
			if(i<ddays)
				sum += Math.min(2*c.sell, c.persons);
			else
				sum = sum + Math.min(c.sell, c.persons);
			i++;
		}
		System.out.println(sum);
		

   }
}
