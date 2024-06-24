package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List li=new ArrayList(); //up cast ArrayList to List (implicit)
		li.add("11");
		li.add("13");
		li.add(null);
		li.add("moon");
		li.add("sun"); 
		System.out.println(li);
		
		ListIterator l2=li.listIterator();
		System.out.println("Print next elements- forward traverse");
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		
		System.out.println("Print previous elements- backward traverse");
		while(l2.hasPrevious()) //checks element is there previously
		{	
			System.out.println(l2.previous()); //prints previous element
		}
	}

}
