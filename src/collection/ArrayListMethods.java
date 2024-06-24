package collection;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		//3 types of add methods
				ArrayList a1=new ArrayList();
				a1.add("ram"); //parameter of add method is object
				a1.add("jaya");
				a1.add("sachu");
				a1.add(10);
				a1.add(90);
				a1.add(0,100); //adds 100 at the index 0
				
				System.out.println(a1);
				
				ArrayList a2=new ArrayList();
				a2.add("jai");
				a2.add("krishna");
				a2.set(0, "jayashree");
				a2.addAll(a1); //return type of addAll is Collection, adding a1 in a2
				System.out.println(a2);
				
				//3 types of remove methods
				a2.remove(6);//removes element at the index 6
				a2.remove("krishna"); //remove object krishna
				a2.removeAll(a1); //remove collection a1 from a2
				System.out.println(a2);
				
				//set method - replaces the element
				a1.set(1,"shri ram"); //1 is index, shri ram is object, ram is replaced with shri ram
				System.out.println(a1);
				
				//clear method - clear whole arraylist
			//	a1.clear(); //how removeAll is different from clear?
			//	a1.removeAll(a1);
				System.out.println(a1);
				
				//contains method
				System.out.println(a1.contains("seeta"));
				System.out.println(a2.containsAll(a1));
				
				//isEmpty method
				a1.clear();
				System.out.println(a1.isEmpty());
				
				//size method
				System.out.println(a1.size());
				System.out.println(a2.size());
				
	}

}
