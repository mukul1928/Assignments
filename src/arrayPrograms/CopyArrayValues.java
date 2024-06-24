package arrayPrograms;

import java.util.Arrays;

public class CopyArrayValues {

	public static void main(String[] args) {
		
		int array1[]=new int[5];
		array1[0]=2;
		array1[1]=4;
		array1[2]=6;
		array1[3]=8;
		array1[4]=10;
		System.out.println(Arrays.toString(array1));
		
		int array2[]=new int[array1.length];
		array2[0]=10;
		array2[1]=8;
		array2[2]=6;
		array2[3]=4;
		array2[4]=2;
		System.out.println(Arrays.toString(array2));
		
		int array3[]=new int[array2.length];
		
		//reverse array2
		for(int i=array2.length-1 ; i>=0 ; i--)
		{
				array3[i]=array2[i]; //copy array2 to array3
		}
			
		System.out.println(Arrays.toString(array2));
		
		System.out.println(Arrays.equals(array1, array3));

	}

}
