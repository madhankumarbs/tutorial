package learnCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class ArrayLIst {
	
	ArrayList<String> array_list = new ArrayList<String>();
	
	@Test
	public List<String> learnArrayList()
	
	{
		
		array_list.add("Madhan");
		array_list.add("Kumar");
	
	array_list.add("Aumar");

	array_list.add("umar");

	array_list.add("Kumar");

	array_list.add("Rumar");

	array_list.add("Kumar");

	array_list.add("Kumar");

	array_list.add("Kumar");

	
	array_list.add("Kumar");

	array_list.add("Kumar");
	
	System.out.println (array_list.size());
	
	array_list.remove(6);
	System.out.println (array_list.size());
	array_list.size();
	
	array_list.sort(null);
	return array_list;
	}

	@Test
	public void iterateArrayList()
	
	{
		learnArrayList();
		for (int i=0; i < (array_list.size()); i++)
		{
			if (i==0)
			{
				array_list.add(0, "MadhanDude");
				System.out.println (array_list.get(i));

			} else
			
			System.out.println (array_list.get(i));

		}
		
	}
	
	@Test
	public void americaFlag()
	{
		List<String> amerflag = new ArrayList<String>();
		
		amerflag.add("* * * * * * ==================================                          \n");
		amerflag.add(" * * * * *  ==================================                          \n");
		amerflag.add("==============================================                          \n");

		System.out.print(amerflag.get(0));
		System.out.print(amerflag.get(1));
		System.out.print(amerflag.get(0));
		System.out.print(amerflag.get(1));
		System.out.print(amerflag.get(0));
		System.out.print(amerflag.get(1));		
		System.out.print(amerflag.get(0));
		System.out.print(amerflag.get(1));
		System.out.print(amerflag.get(1));
		System.out.print(amerflag.get(2));
		System.out.print(amerflag.get(2));
		System.out.print(amerflag.get(2));
		System.out.print(amerflag.get(2));
		System.out.print(amerflag.get(2));
		System.out.print(amerflag.get(2));


		
	}
	
	@Test
	public void copyreverseshufflelist ()
	
	{
		learnArrayList();
		
		List<String> translist = new ArrayList<String>(array_list);
		System.out.println("Normal" +array_list);

		Collections.reverse(array_list);

		System.out.println("Reverse" +array_list);
		Collections.shuffle(array_list);

		System.out.println("Shuffle" +array_list);

		
		//Collections.copy(translist, array_list);
		
		System.out.println("COPYY" +translist );
		
		System.out.println("Extract a Portion" +translist.subList(4, 9));
		
		//swap two elements in an array list
		Collections.swap(translist, 4, 5);
		System.out.println("swap two elements in an array list" +translist);
		translist.addAll(array_list);
		System.out.println("Add two list" +translist);
		array_list.removeAll(array_list);
		System.out.println("empty" +array_list);
		System.out.println("isempty" +array_list.isEmpty());
		
		array_list.clear();
		array_list.ensureCapacity(13);
		
		
	}	

}
