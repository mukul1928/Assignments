package arrayPrograms;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int age[]=new int[3];
		age[0]=17;
		age[1]=15;
		age[2]=30;
		age[2]=50; //updating value of index in array
		
		//age[3]=35;
		
		System.out.println(age[0]); //printing one by one
		System.out.println(age[1]);
		System.out.println(age[2]);
		
		Arrays.sort(age); //sorting of arrays
		
				
		for(int i=0;i<=2;i++) //printing once using for loop
		{
			System.out.println(age[i]);
		}
		
		System.out.println(Arrays.toString(age)); //other way of printing array

	}

}
