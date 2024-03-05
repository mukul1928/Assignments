package typeCastingPackage;

class Teacher1
{
	void teach()
	{
		System.out.println("Teaching");
	}
}

class Mentor1 extends Teacher1
{
	void mean()
	{
		System.out.println("Mentoring");
	}
}

public class Student_Upcasting3 extends Mentor1
{
	void stud()
	{
		System.out.println("Studying");
	}

	public static void main(String[] args) {
		
		Teacher1 t1=new Student_Upcasting3();
		t1.teach();
				
	}

}
