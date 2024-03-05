package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SizeofArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//enter the size of an array from scanner
		System.out.println("Enter the size of an array");
		int size=scan.nextInt();
		
		//create an array of size entered
		int array[]=new int[size];
		
		//enter array elements by scanner class
		System.out.println("Enter array values");
		for(int i=0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}
		
		//sort the array
		Arrays.sort(array);
		
		//print array values
		System.out.println(Arrays.toString(array));
		
		
	}

}
