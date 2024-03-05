package javaPackage;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		//System.out.println(d1.getTime());
		System.out.println(d1.getTime()+(1000*60*60*24*10));
		
		Date d2=new Date(d1.getTime()+(1000*60*60*24*10));
		System.out.println(d2);
		
		//fetch month
		String a1=d2.toString(); //convert date into string
		String month=a1.substring(4, 7);
		System.out.println(month);
	
		//fetch day
		String date=a1.substring(8, 10);
		System.out.println(date);
		
		//length of string
		//System.out.println(a1.length());
		
		//fetch year
		String year=a1.substring(24, 28);
		System.out.println(year);
		
		System.out.println(date.concat(month).concat(year));
		//date format > DD MM YYYY
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		//date format > DD-MM-YYYY
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		//date format > DD/MM/YYYY
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		
		
		
	}

}
