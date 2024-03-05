package javaAssignments;

import java.util.Scanner; //import scanner class package

public class Scanner_Demo {

	public static void main(String[] args) {
		//Scanner is predefined class to accept input
		
		Scanner s1=new Scanner(System.in); //creating object of scanner class
		int n1=s1.nextInt(); //invoking scanner class methods
		int n2=s1.nextInt();
		
		int sum=n1+n2;
		System.out.println(sum);
		
		int n3=s1.nextInt(); //integer scanner declaration
		
		byte b1=s1.nextByte(); //byte scanner declaration
		
		short sh=s1.nextShort(); //short scanner declaration
		
		long l=s1.nextLong(); //long scanner declaration
		
		double d=s1.nextDouble(); //double scanner declaration
		
		float f=s1.nextFloat(); //float scanner declaration
		
		String name=s1.next(); //next() scanner declaration - String
		
		String line=s1.nextLine(); //nextLine() scanner declaration - String
		
		boolean b=s1.nextBoolean(); //boolean scanner declaration

	}
}
