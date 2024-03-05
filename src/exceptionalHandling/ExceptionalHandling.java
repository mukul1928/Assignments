package exceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalHandling {

	public static void main(String[] args) {
		try
		{
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt(); //1. enter 1 - answer is 1 - try block executes
								  //2. enter 0 - answer is infinite - a1 catch block executes
								  //3. enter string - a2 catch block executes
			int c=1/a;
			System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("handled exception 1");
		}
		
		catch(InputMismatchException a2)
		{
			System.out.println("handled exception 2");
		}
		
	}

}
