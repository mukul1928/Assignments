package arrayPrograms;

import java.util.Arrays;

public class ArrayDemo3 
{
	public static void main(String[] args) 
	{
	String name="vedant";
	
		char a1[]= name.toCharArray();
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
	}

}
