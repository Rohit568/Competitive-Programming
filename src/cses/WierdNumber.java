package cses;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class WierdNumber {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(n!=1)
		{
			bf.write(String.valueOf(n)+" ");
			if(n%2 == 1)
			{
				n = 3*n + 1;
			}
			else
			{
				n = n/2;
			}	
		}
		bf.write("1");
		br.close();
		bf.close();
	}

}
