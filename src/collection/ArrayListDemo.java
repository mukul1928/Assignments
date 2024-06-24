package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList(); //follows indexing
		a1.add(100); 
		a1.add(987);
		a1.add(800);
		a1.add("manish");
		a1.add(false);
		a1.add('m');
		a1.add(14.6);
		a1.add(100); //accepts duplicates
		a1.add("manish");
		a1.add(null);//accepts multiple null
		a1.add(null);
		a1.add(true);
		System.out.println(a1); //heterogeneous array list cannot be sorted
		
		ArrayList a2=new ArrayList(); //follows indexing
		a2.add(100); 
		a2.add(987);
		a2.add(800);
		a2.add(10); 
		a2.add(98);
		a2.add(81);
		Collections.sort(a2); //when array list is homogeneous then it can be sorted
		System.out.println(a2);

	}

}
