package stringPrograms;

public class StringFunctions1 {

	public static void main(String[] args) {
		
		String name="Orange";
		boolean ans=name.endsWith("e");
		System.out.println(ans);
		
		String rep=name.replace('g', 'A');
		System.out.println(rep);
		
		String n1="orange fruit";
		String ans2=n1.replaceAll("fruit", "and banana");
		System.out.println(ans2);
		
		//in a given string replace all the numeric values
		String name1="world no 1";
		System.out.println(name1.replaceAll("[0-9]", " "));
	
		//in a given string replace all the alphabet values
		System.out.println(name1.replaceAll("[a-z]", " "));
		
		//in a given string replace all the capital and small alphabet value
		String name2="manish Kumar TIWARI";
		System.out.println(name2.replaceAll("[A-Z]", " "));
		System.out.println(name2.replaceAll("[a-z]", " "));
		
		System.out.println(name2.isEmpty());
		String m2="";
		System.out.println(m2.isEmpty());
		
		System.out.println(name1.equals(name));
		
		/*String n2="sachit"; //reverse string - its not ideal way bcs ans is char type
		for(int i=n2.length()-1;i>=0;i--)
		{
			char answer=name.charAt(i);
			System.out.print(answer);
		}*/ 
		
		//Program to check given string is palindrome or not
		
		String n2="Sachit";
		String rev="";
		
		for(int i=n2.length()-1;i>=0;i--)
		{
			char answer=n2.charAt(i);
			rev=rev+answer;	
		}
		System.out.print(rev);
		
		boolean a1=n2.equals(rev);
		System.out.println(a1);
		
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
