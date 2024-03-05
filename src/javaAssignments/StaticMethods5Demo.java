package javaAssignments;
public class StaticMethods5Demo {
	
	static void add() {
		int a=100, b=20;
		int sum=a+b;
		System.out.println("Addition of a and b = "+sum);
	}	
	static void subtract() {
		int a=130, b=70;
		int sub=a-b;
		System.out.println("Subtraction of a and b = "+sub);
	}
	static void multi() {
		int a=12, b=15;
		int mul=a*b;
		System.out.println("Multiplication of a and b = "+mul);
	}

	public static void main(String[] args) {
		add();
		subtract();
		multi();
		division();
		modulo();
	}
	
	static void division() {
		int a=100, b=10;
		int div=a/b;
		System.out.println("Subtraction of a and b = "+div);
	}
	static void modulo() {
		int a=130, b=12;
		int mod=a%b;
		System.out.println("Modulo of a and b = "+mod);
	}

}
