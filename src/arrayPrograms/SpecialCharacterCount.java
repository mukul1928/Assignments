package arrayPrograms;
public class SpecialCharacterCount {

	public static void main(String[] args) {
		
		String name="sky is 441 !@#";
		char c1[]=name.toCharArray();		
		int alphaCount=0;
		int digitCount=0;
		int spaceCount=0;
		
		for(int i=0; i<name.length(); i++)
		{
			boolean ans=Character.isAlphabetic(c1[i]);
			boolean ans1=Character.isDigit(c1[i]);
			boolean ans2=Character.isSpaceChar(c1[i]);
			
			if(ans==true)
			{
				alphaCount++;
			}
			if(ans1==true)
			{
				digitCount++;
			}
			if(ans2==true)
			{
				spaceCount++;
			}
		}		
		System.out.println("Number of alphabets : "+alphaCount);
		System.out.println("Number of numerics : "+digitCount);
		System.out.println("Number of spaces : "+spaceCount);
		System.out.println("Number of special chars : "+(name.length()-(alphaCount+digitCount+spaceCount)));

	}

}
