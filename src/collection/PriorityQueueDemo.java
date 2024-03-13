package collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue p1=new PriorityQueue(); //not follows indexing
		p1.add(120);
		p1.add(235);
		//p1.add('M'); //not heterogeneous throws ClassCastException
		p1.add(50);
		//p1.add("java");
		//p1.add(12.45);
		p1.add(29);
		p1.add(500);
		p1.add(50); //accepts duplicates
		//p1.add(null); //not accepts null throws NullPointerException
		p1.add(305); //dynamic in nature
		
		//Collections.sort(p1);  //sorting is not done
		System.out.println(p1);
		
		PriorityQueue p2=new PriorityQueue();
		p2.add("jaya");
		p2.add("chetan");
		p2.add("smita");
		p2.add("sachit");
		p2.add("priya");
		System.out.println(p2);
	}

}
