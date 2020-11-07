package networking;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileMan {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		try {
		
			File f = new File("/home/rohit/rohit.txt");
			InputStream  ins = new FileInputStream("rohit.txt");
		    System.out.println(ins);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}

	}

}
