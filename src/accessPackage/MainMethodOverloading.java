package accessPackage;

public class MainMethodOverloading {
	
	public static void main(int x, double d) {
		
		System.out.println(x+d);	
	}

	public static void main(String[] args) {
		
		System.out.println("Start execution");
		main(25);
		main(10,25.5);
		main("java");

	}
	public static void main(int a) {
		
		System.out.println(a*a);
	}
	
	public static void main(String s) {
		
		System.out.println("main method overloading");
		
	}

}
