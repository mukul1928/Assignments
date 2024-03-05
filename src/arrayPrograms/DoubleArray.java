package arrayPrograms;

import java.util.Arrays;

public class DoubleArray {

	public static void main(String[] args) {
		
		//array of double data type
		double marks[]=new double[5];
		marks[0]=98.01;
		marks[1]=95.25;
		marks[2]=96.5;
		marks[3]=96;
		marks[4]=97.50;
		
		Arrays.sort(marks); //sorting of array
		
		System.out.println(Arrays.toString(marks)); //print array values
		
		//array of boolean data type
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println(Arrays.toString(b));
		
	}

}
