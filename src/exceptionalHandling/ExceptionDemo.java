package exceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try
		{
			int number=scan.nextInt();
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Arithmetic exceptions are handled");
		}
		catch(InputMismatchException a2)
		{
			System.out.println("Wrong user input exceptions are handled");
		}
		catch(ArrayIndexOutOfBoundsException a3)
		{
			System.out.println("Array overflow exceptions are handled");
		}
		catch(NullPointerException a4)
		{
			System.out.println("Pointer exceptions are handled");
		}
		finally
		{
			System.out.println("Finally handled all exceptions - Finally is always there");
		}

	}

}
