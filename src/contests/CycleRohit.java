package contests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        Scanner s = new Scanner(System.in);
    
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<26; i++)
        map.put((char)('a'+i), i);

        int test = s.nextInt();
        while(test-->0)
        {
         
        String str = s.next();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int currpos = 0;
        for(int i=0; i<str.length(); i++)
        {
            int t = map.get(str.charAt(i));

            int a = t - currpos;
            int b =  26 - currpos +t;

            if(a <= b)
            {
                list.add(a);
            }
            else
            {
                list.add(b);
            }
            currpos = t;
          
        }
          
             System.out.println(list);
        }

    }
}
