package accessSpecifiers;

import accessPackage.StudentAccess;

public class TeacherAccess extends StudentAccess {

	public static void main(String[] args) {
		
		TeacherAccess s1=new TeacherAccess();
		s1.learnAPI(); //public method
		s1.learnJava(); //protected method
		

	}

}
