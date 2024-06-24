package typeCastingPackage;

public class TypeCast {

	public static void main(String[] args) {
		
		int age=52;
		double wt=age; //Widening - implicit way
		System.out.println(wt);
		
		int weight=54;
		double weight1=(double)weight; //Widening - explicit way
		System.out.println(weight1);

	}

}
