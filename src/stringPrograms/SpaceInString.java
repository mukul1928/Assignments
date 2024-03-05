package stringPrograms;

public class SpaceInString {

	public static void main(String[] args) {

		String s="jaya sachit sureban";
		char c[]=s.toCharArray();
		
		for(int i=0; i<s.length(); i++)
		{
			boolean ans=Character.isSpaceChar(c[i]);
			
			if(ans==true)
			{
				System.out.println("String contains space");
				System.out.println("Space is in the index "+i);
			}
			
		}
		
		

	}

}
