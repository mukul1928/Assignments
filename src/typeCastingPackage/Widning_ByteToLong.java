package typeCastingPackage;

public class Widning_ByteToLong {

	public static void main(String[] args) {
		
	byte b=100;
	long l	= b; //implicit - byte to long type
	System.out.println(l);
	
	byte b1=110;
	long l2=(long) b1; //explicit
	System.out.println(l2);
	
	}

}
