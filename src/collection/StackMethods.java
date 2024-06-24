package collection;

import java.util.Stack;

public class StackMethods {

	public static void main(String[] args) {
		
		Stack<String> s1=new Stack();
		s1.push("10"); //stack method push
		s1.push("jaya");
		s1.push("object");
		s1.push("10");
		s1.add("1000"); //list method add
		s1.addElement("sachit"); //vector method addElement
		s1.addElement("sachit");
		System.out.println(s1);
		System.out.println("size "+s1.size());		
		
		System.out.println("get last element of stack: "+s1.peek());
		
		System.out.println(s1.search("10"));
		
		s1.pop();
		System.out.println(s1);
	}

}
