package dependent;

import dependency.Teacher;

public class PublicSchool implements School {
	private Teacher subjectTeacher;// =new EnglishTeacher();

	// constuctor based D.I - injecting mandatory dependencies
	public PublicSchool(Teacher myTeacher) {
		this.subjectTeacher = myTeacher;
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void manageAcademics() {
		System.out.println("Managing academics here -");
		subjectTeacher.teach();// using the dependency to exec B.L
	}

//	//setter based D.I - injecting optional dependencies !
//	public void setSubjectTeacher(Teacher subjectTeacher) {
//		System.out.println("in setter");
//		this.subjectTeacher = subjectTeacher;
//	}
	// add custom init method
	public void anyInit() // throws Exception
	{
		System.out.println("in init " + getClass());
	}

	// add custom destroy method
	public void anyDestroy() // throws Exception
	{
		System.out.println("in destroy " + getClass());
	}

}
