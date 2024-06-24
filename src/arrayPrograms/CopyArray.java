package arrayPrograms;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int array1[]=new int[4];
		array1[0]=43;
		array1[1]=83;
		array1[2]=74;
		array1[3]=96;
		
		System.out.println("Array 1 : ");
		System.out.println(Arrays.toString(array1));
		
		int array2[]=new int[array1.length]; //length of both arrays should be same
		
		for(int i=0; i<array1.length; i++)
		{
			array2[i]=array1[i]; //copies from right to left
		}
		System.out.println("Array 2 : ");
		System.out.println(Arrays.toString(array2));

	}

}
