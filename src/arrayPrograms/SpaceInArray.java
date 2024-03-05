package arrayPrograms;

public class SpaceInArray {

	public static void main(String[] args) {
		
		String name="jaya sureban";
		char c1[]=name.toCharArray(); //Converting to char array
		
		for(int i=0; i<name.length();i++)
		{
			boolean ans=Character.isSpaceChar(c1[i]);
			//System.out.println(ans);
		
			if(ans==true)
			{
				System.out.println("There is a space in string");
				System.out.println("Space is in the index "+i);
			}
		}
	}
}

