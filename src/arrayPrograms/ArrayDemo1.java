package arrayPrograms;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		String name[]=new String[5];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		name[3]="Shiva";
		name[4]="Laxmi";
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
		
		Arrays.sort(name);
		System.out.println(Arrays.toString(name)); //this is used to print array values without for loop

	}

}
