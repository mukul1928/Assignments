package typeCastingPackage;

class Teacher1
{
	void teach()
	{
		System.out.println("Teaching");
	}
}

class Mentor1 
{
	void mean()
	{
		System.out.println("Mentoring");
	}
}

public class Student_Upcasting3 extends Teacher1 //upcasting to Teacher1
{
	void stud()
	{
		System.out.println("Studying");
	}

	public static void main(String[] args) {
		
		Teacher1 t1=new Student_Upcasting3();
		t1.teach();
		
	//	Student_Upcasting3 s1=new Mentor1(); // there is no upcasting
		
		Student_Upcasting3 s2=(Student_Upcasting3) new Teacher1(); //downcasting 
		s2.stud();
		s2.teach();
					
	}
}
