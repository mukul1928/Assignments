package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Iterator {

	public static void main(String[] args) {
		
		Set se=new HashSet();
		se.add("pencil");
		se.add("plate");
		se.add(null);
		se.add("pendrive");
		se.add("pen"); 
		se.add("15");
		System.out.println(se);
		
		Iterator i3=se.iterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}
	}
}
