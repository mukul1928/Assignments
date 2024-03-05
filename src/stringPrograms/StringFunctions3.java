package stringPrograms;

public class StringFunctions3 {

	public static void main(String[] args) {
		
		String s1="jaya sureban";
		boolean a1=s1.contains("jaya");
		System.out.println(a1);
		
		String s2="orange";
		boolean a2=s2.matches("o....."); //dot means characters
		System.out.println(a2);
		
		boolean a3=s1.matches("(.*)a"); //ends with
		System.out.println(a3);
		
		boolean a4=s1.matches("j(.*)"); //starts with
		System.out.println(a4);
		
		

	}

}
