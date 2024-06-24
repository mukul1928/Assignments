package scannerPrograms;

import java.util.Scanner;

public class GlobalVariableFromScanner {
	
	int a, b;//global variables
	
	public void add(int a, int b)
	{
		System.out.println("a+b="+(a+b));
	}
	
	public static void sub(int a, int b)
	{
		System.out.println("a-b="+(a-b));
	}
	
	public static void main(String[] args) {
		
		GlobalVariableFromScanner gb=new GlobalVariableFromScanner();
		
		Scanner scan=new Scanner(System.in);
		gb.a=scan.nextInt();
		gb.b=scan.nextInt();
		
		gb.add(gb.a, gb.b);
		sub(gb.a,gb.b);
		
		scan.close();
	}

}
