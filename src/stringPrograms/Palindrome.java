package stringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		String name="mom";
		String rev="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			char answer=name.charAt(i); //char at the end of string
			rev=rev+answer;	//reverse the string
		}
		System.out.println(rev);
		
		boolean a1=name.equals(rev); //check name and reversed string are equal
		//System.out.println(a1);
		
		if(a1==true)
		{
			System.out.println("Its palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}		

	}

}
