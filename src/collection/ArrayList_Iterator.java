package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Iterator {

	public static void main(String[] args) {
		
		List li=new ArrayList(); //up cast ArrayList to List (implicit)
		li.add("11");
		li.add("13");
		li.add(null);
		li.add("moon");
		li.add("sun"); 
		System.out.println(li);
		
		Iterator i2=li.iterator(); //iterator is abstract method of Iterator interface
		while(i2.hasNext()) //hasNext() method checks next element is there or no
		{
			System.out.println(i2.next()); //next() method is used to print next element
		} 
	}

}
