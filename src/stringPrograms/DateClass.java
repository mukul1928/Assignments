package stringPrograms;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d1=new Date();
		long time=d1.getTime();
		//System.out.println(time);
		
		Date d2=new Date(d1.getTime()+(1000*60*60*24*10)); //milisec*mins*hours*hours*days
		System.out.println(d2);
	}

}
