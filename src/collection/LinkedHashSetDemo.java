package collection;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		LinkedHashSet list=new LinkedHashSet(); //indexing
		list.add(200); 
		list.add(23);
		list.add(45);
		list.add(45); //no duplicates
		list.add('k');
		list.add(45.67); //heterogeneous
		list.add("abcd");
		list.add(null); //accepts null
		list.add(4509098); //dynamic
		
		//Collections.sort(list);
		System.out.println(list);
		
		LinkedHashSet list1=new LinkedHashSet(); //indexing
		list1.add(200); 
		list1.add(23);
		list1.add(45);
		list1.add(45);
		list1.add(230);
		list1.add(405);
		list1.add(5);
		//Collections.sort(list1); //no sort
		System.out.println(list1);
	}

}
