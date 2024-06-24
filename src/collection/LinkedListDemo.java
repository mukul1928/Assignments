package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list1=new LinkedList(); //follows indexing
		list1.add(234);
		list1.add(139);
		list1.add(800.78); //heterogeneous
		list1.add('S');
		list1.add("sachit");
		list1.add(null); //accepts multiple null
		list1.add(null);
		list1.add("sachit"); //accepts duplicates
		list1.add(234);
		list1.add(139);	//dynamic
		//Collections.sort(list1); //ClassCastException
		System.out.println(list1);
		
		LinkedList list2=new LinkedList(); //follows indexing
		list2.add(234);
		list2.add(139);
		list2.add(75);
		list2.add(680);
		list2.add(139);
		list2.add(14);
		Collections.sort(list2); //sorts only homogeneous values
		System.out.println(list2);

	}

}
