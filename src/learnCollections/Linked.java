package learnCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class Linked {
	
	LinkedList<String> linked_list = new LinkedList<String>();
	
	@Test
	public  List<String> linkedlistlearning()
	
	{
		linked_list.add("Madhan");
		linked_list.add("ABC");
		linked_list.add("Egf");
		linked_list.add("LMO");
		linked_list.add("CDE");
		
		return linked_list;
	}
	
	@Test
	public void linkedlistiteration()
	
	{
		linkedlistlearning();
		
		Iterator<String> it = linked_list.iterator();
		
		while (it.hasNext()) {System.out.println(it.next());}
		linked_list.clear();
		
	}
	
	@Test
	public void linkedlistreverseiteration()
	
	{
		linkedlistlearning();
		
		linked_list.addFirst("First");
		linked_list.add(5, "Middle");
		linked_list.addLast("Last");
		
		Iterator<String> it = linked_list.descendingIterator();

		
		while (it.hasNext())
			
		{
			System.out.println(it.next());

		}
		System.out.println("last" +linked_list.getLast());
		System.out.println("First" +linked_list.getFirst());

		linked_list.removeFirstOccurrence("First");
		
	}

}
