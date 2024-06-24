package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo {

	public static void main(String[] args) {
		
		System.out.println("List behaviour");
		List li=new ArrayList(); //up cast ArrayList to List (implicit)
		li.add("11");
		li.add("13");
		li.add("90");
		li.add(null);//List allows multiple null values
		li.add(null);
		li.add("sun");
		li.add("moon");
		li.add("sun"); //List allows duplicates
		System.out.println(li); //List follows indexing 
		//List follows order of insertion
		
		System.out.println("Set behaviour");
		Set se=new HashSet(); //up cast HashSet to Set
		se.add("pencil");
		se.add("plate");
		se.add(null);
		se.add(null); //Set allows only one null value
		se.add("pen");
		se.add("pendrive");
		se.add("pen"); //Set doesn't allow duplicates
		se.add("peacock");
		System.out.println(se); //Set doesn't follow indexing 
		//Set doesn't follow order of insertion

	}

}
