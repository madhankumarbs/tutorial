package learnCollections;

import java.util.Arrays;

public class LearnArray {
	
	public static void main (String args[]) {
		
    int a[] = new int [5];
    
    a[0] = 5;
    
    
    int b[] = {1,2,3,4,5};
    
    System.out.println(a[0]);
    
    System.out.println(b);

    System.out.println(b.length);
    
    for (int i=0; i<b.length; i++)
    	
        System.out.println(b[i]);

 int aa[][] = {{1,2,3,4,5},{1,2,3,4,5}};
 System.out.println(aa[0][1]);
 
 System.out.println(Arrays.deepToString(aa));
 System.out.println(Arrays.toString(b));
 
 int c[] = b.clone();
 System.out.println(Arrays.toString(c));
 
String d = String.join(" ----  ", Arrays.toString(c));

System.out.println("d is " +d);


		
	}

}
