package arrayPrograms;

public class AlphaNumDemo {

	public static void main(String[] args) {
	
		String name="mango";
		char c1[]=name.toCharArray();
		
		int alphaCount=0;
		int digitCount=0;
		
		for(int i=0; i<name.length(); i++)
		{
			boolean ans=Character.isAlphabetic(c1[i]);
			boolean ans1=Character.isDigit(c1[i]);
			
			if(ans==true)
			{
				alphaCount++;
			}
			if(ans1==true)
			{
				digitCount++;
			}
		}
			
		System.out.println("Number of alphabets : "+alphaCount);
		System.out.println("Number of numerics : "+digitCount);

	}
}
