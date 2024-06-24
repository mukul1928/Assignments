package mathClassPackage;

public class MulDivision {
	
	int a;
	int b;
	
	public int multi(int a, int b)
	{
		this.a=a;
		this.b=b;
		return Math.multiplyExact(a, b);
	}
	
	public static void main(String[] args) {
		
		MulDivision m1=new MulDivision();
		System.out.println(m1.multi(10, 10));
	}

}
