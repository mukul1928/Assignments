package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RuntimeArray {

	public static void main(String[] args) {
		
		int num[]=new int[3];
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Array values");
		
		for(int i=0;i<num.length;i++) 
		{
			num[i]=scan.nextInt();
		}
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
