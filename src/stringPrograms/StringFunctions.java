package stringPrograms;

public class StringFunctions {

	public static void main(String[] args) {
		
		String name="Jayashree MS";
		
		int length=name.length(); //length of string
		System.out.println("Length of string : "+length);
		
		String upper=name.toUpperCase(); //converts given string into upper case
		System.out.println("Uppercase : "+upper);
		
		String lower=name.toLowerCase(); //converts given string into lower case
		System.out.println("Lowercase : "+lower);
		
		char index=name.charAt(2); //charAt(index) returns char at given index
		System.out.println("char at index 2 : "+index);
		
		String name1="  Jayashree  ";
		System.out.println("Before trim : "+name1);
		String trim=name1.trim(); //trim() trims the given string
		System.out.println("After Trim function : "+trim);
		
		String n1="sachit";
		String n2="sureban";
		String space=" ";
		String fullname=n1.concat(space).concat(n2); //Concatenate 2 strings
		System.out.println("Fullname : "+fullname);

		
	}

}
