package javaAssignments;

public class ForLoop_Demo {
	
	public static void main(String[] args) {
		
		for(int i=0; i<=-1; i++) //not starts
		{
			System.out.println(i);
		}
		
		/*for(int i=0; i<=1; i--) //infinite loop
		{
			System.out.println(i);
		}*/
		
		/*for(int i=-1; i<=1; i--) //infinite loop
		{
			System.out.println(i);
		}*/
		
		/*for(int i=-10; i<0; i--) //infinite loop
		{
			System.out.println(i);
		}*/
		
		/*for(int i=-10; i<0; i++) //-10 t0 -1
		{
			System.out.println(i);
		}*/
		
		for(int i=0; i<=100; i++) //Even numbers from 0-100
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
