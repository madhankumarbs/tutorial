package learnCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class LearnArrayList {

	
	public static void main (String []args)
	
	{
		
		ArrayList<String> alist = new ArrayList<String>(Arrays.asList("Madhan", "Kumar", "Bhonsle", "Somu"));
		

		for(String str:alist)
		{
			
			System.out.println("string arraylist====" +str + alist.size());
			alist.size();
		}
		
		alist.add(1, "inserting frsh data");

		
		for(String str:alist)
		{
			
			System.out.println("string arraylist====" +str + alist.size());
		}
		
		alist.remove(1);
		
		alist.clone();
		
		System.out.println( alist.size());

		
	}
	
	
}
