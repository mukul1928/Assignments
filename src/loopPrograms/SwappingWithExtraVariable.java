package loopPrograms;

public class SwappingWithExtraVariable {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int c=0;
		
		c=c+a;	//10
		a=b;	//20
		b=c;	//10
		
		System.out.println("After swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
