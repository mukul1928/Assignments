package stringPrograms;

public class GroTechMinds {

	public static void main(String[] args) {

		String name="GroTechMinds"; //print the string vertically
		
		char c[ ]=name.toCharArray();
		
		for(int i=0; i<name.length(); i++)
		{
			System.out.println(c[i]);
		}
	}

}
