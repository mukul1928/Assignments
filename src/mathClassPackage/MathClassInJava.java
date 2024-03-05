package mathClassPackage;

public class MathClassInJava {

	public static void main(String[] args) {
		
		//double pi=3.14;
		
		double pi=Math.PI;
		int r=7;
		System.out.println(pi*r*r);
		
		System.out.println(Math.addExact(340, r));
		System.out.println(Math.addExact(123456789, 7432));
		
		System.out.println(Math.subtractExact(789, 675));
		
		System.out.println(Math.multiplyExact(r, r));
		
		System.out.println(Math.sqrt(100));
		System.out.println(Math.min(55, 85));
		System.out.println(Math.max(74, 67));
		
		for(int i=0; i<10; i++)
		{
			System.out.println(Math.random()); //all time different values
		}
		
		
	}

}
