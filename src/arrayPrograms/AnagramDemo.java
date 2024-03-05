package arrayPrograms;

import java.util.Arrays;

public class AnagramDemo 
{
	public static void main(String[] args) 
	{
		String name1="night";
		String name2="thing";
		if(name1.length()!=name2.length())
		{
			System.out.println("Sorry the given two strings are not anagram");
		}
		else
		{
			char n1[]=name1.toCharArray();
			char n2[]=name2.toCharArray();
			
			Arrays.sort(n1);
			Arrays.sort(n2);
			System.out.println(Arrays.toString(n1));
			System.out.println(Arrays.toString(n2));
			
			boolean answer=	Arrays.equals(n1, n2);
			//System.out.println(answer);
			
				if(answer==true)
				{
					System.out.println("The given two Strings are anagram");
				}
				else
				{
					System.out.println("The given two Stings are not anagram");
				}			
		}
	}
}
