package collection;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst("one");
		list.add(2);
		list.add(2, "three");
		list.add("4.0");
		list.addLast("five");
		System.out.println(list);
		
		LinkedList list1=new LinkedList();
		list1.addFirst("first element");
		list1.addAll(list);
		System.out.println(list1);
		
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		
		System.out.println(list.pollFirst());
		System.out.println(list.pollLast());
		
		list.removeFirst();
		System.out.println(list);

	}

}
