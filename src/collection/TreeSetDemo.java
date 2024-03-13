package collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t1=new TreeSet(); //not follows index
		t1.add(14);
		t1.add(9);
		t1.add(200);
		//t1.add("set"); //not heterogeneous throws ClassCastException
		//t1.add('j');
		//t1.add(14.9);
		//t1.add(null);  //not accepts null throws NullPointerException
		t1.add(900);
		t1.add(9); //not accepts duplicates
		t1.add(19);
		t1.add(25);
		t1.add(91);
		t1.add(100); //dynamic
		
		//Collections.sort(t1); //automatically sorts
		System.out.println(t1);
		
		TreeSet t2=new TreeSet();
		t2.add('m');
		t2.add('a');
		t2.add('p');
		t2.add('z');
		t2.add('e');
		System.out.println(t2);
		
		TreeSet t3=new TreeSet();
		t3.add("jaya");
		t3.add("chetan");
		t3.add("smita");
		t3.add("sachit");
		t3.add("varun");
		t3.add("arun");
		System.out.println(t3);

	}

}
