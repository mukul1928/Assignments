package exceptionalHandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practicetry3catch {

	public static void main(String[] args) {
		try
		{
			Scanner scan=new Scanner(System.in);	
			int num=scan.nextInt();
			
			int ans=1/num;
			System.out.println(ans);
			
			int array[]=new int[2];
			array[0]=10;
			array[1]=20;
			array[2]=30;
			
			System.out.println(Arrays.toString(array));
			
		}
		catch(ArithmeticException a)
		{
			System.out.println("Arithmetic Exception handled");
		}
		
		catch(InputMismatchException b)
		{
			System.out.println("Input Mismatch Exception handled");
		}
		
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println("Array Index Out Of Bounds Exception handled");
		}
		
		finally
		{
			System.out.println("handle everything");
		}
		
	}
	
}
