package arrayPrograms;

import java.util.Scanner;

public class CountofDigitsAlphas {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		
		String input=scan.nextLine();
		
		int digitCount=0;
		int letterCount=0;
		int spcaceCount=0;
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			
			if(Character.isAlphabetic(ch))
			{
				letterCount++;
			}
			else if (Character.isDigit(ch))
			{
				digitCount++;
			}
			else if(Character.isSpaceChar(ch))
			{
				spcaceCount++;
			}
		}
		System.out.println("Number of digits "+digitCount);
		System.out.println("Number of letters "+letterCount);
		System.out.println("Number of spaces "+spcaceCount);

	}

}
