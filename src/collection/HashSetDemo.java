package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
			HashSet h1=new HashSet(); //not indexing
			h1.add(100);
			h1.add("java"); //heterogeneous
			h1.add('d');
			h1.add(13.7);
			h1.add(true);
			h1.add(null); //accepts null
			h1.add(null); //accepts only one null
			h1.add(100); //not accepts duplicates //dynamic
			System.out.println(h1);
			
			HashSet h2=new HashSet();
			h2.add(100);
			h2.add(10);
			h2.add(145);
			h2.add(3);
			//Collections.sort(h2); //no sorting
			System.out.println(h2);	

	}

}
