package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		Stack s1=new Stack();
		s1.add("jaya");
		s1.add(10);
		s1.add("sachu");
		s1.add("100");
		s1.add(1000);
		System.out.println(s1);

		Enumeration e1=s1.elements();
		System.out.println("Enumeration cursor - forward traverse");
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		System.out.println("Iterator cursor - forward traverse");
		Iterator i2=s1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		ListIterator l3=s1.listIterator();
		System.out.println("ListIterator cursor");
		System.out.println("ListIterator - forward traverse");
		while(l3.hasNext())
		{
			System.out.println(l3.next());
		}
		
		System.out.println("ListIterator - backward traverse");
		while(l3.hasPrevious())
		{
			System.out.println(l3.previous());
		}
	}

}
