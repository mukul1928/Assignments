package arrayPrograms;

public class AlphaNumeric {

	public static void main(String[] args) {
		
		String name="mango123";
		char c1[]=name.toCharArray();
		
		for(int i=0; i<name.length();i++)
		{
			//boolean ans=Character.isAlphabetic(c1[i]);
			boolean ans1=Character.isDigit(c1[i]);
			
			if(ans1==false) 
			{
				System.out.println("Index position "+i +" is Alphabet");
			}
			else
			{
				System.out.println("Index position "+i +" is Numeric");
			}
			
		}
		
		
	}

}
