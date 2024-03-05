package javaAssignments;

import java.util.Date;

public class FuturePastDate {

	public static void main(String[] args) {
		
		//10 days future date and time
		Date d1=new Date();
		System.out.println(d1.getTime()+(1000*60*60*24*10));
		
		Date d2=new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d2);
		
		//10 days past date and time
		Date d3=new Date();
		System.out.println(d3.getTime()+(1000*60*60*24*-10));
		
		Date d4=new Date(d3.getTime()+(1000*60*60*24*-10));
		System.out.println(d4);
	}

}
