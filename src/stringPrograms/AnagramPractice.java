package stringPrograms;

import java.util.Arrays;

public class AnagramPractice {

	public static void main(String[] args) {
		
		String n1="night";
		String n2="thing";
		
		if(n1.length()==n2.length())
		{
			char c1[]=n1.toCharArray();
			char c2[]=n2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("both are anagrams");
			}
			else
			{
				System.out.println("not anagrams");
			}
		}
		else
		{
			System.out.println("strings are not equal, so they cannot be anagrams");
		}

	}

}
