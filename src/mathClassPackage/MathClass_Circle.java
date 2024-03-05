package mathClassPackage;

public class MathClass_Circle {

	public static void main(String[] args) {
		
		double pi=Math.PI;
			
		for(int i=0; i<10; i++)
		{
			double radius=Math.random();
			System.out.println("Area of circle : "+(pi*radius*radius));
		}

	}

}
