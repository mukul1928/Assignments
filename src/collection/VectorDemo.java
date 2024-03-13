package collection;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v1=new Vector(); //follows indexing
		v1.add(100);			//heterogeneous
		v1.add(250);
		v1.add('N');
		v1.add("jaya");
		v1.add(39.345);		//dynamic
		v1.add("jaya");
		v1.add(100);		//accepts duplicates
		v1.add(250);
		v1.add(null);		//accepts null
		//Collections.sort(v1);
		System.out.println(v1);
		
		Vector v2=new Vector();
		v2.add(19);
		v2.add(190);
		v2.add(19);
		v2.add(119);
		v2.add(319);
		v2.add(199);
		Collections.sort(v2);  //can sort homogeneous values
		System.out.println(v2);
	}

}
