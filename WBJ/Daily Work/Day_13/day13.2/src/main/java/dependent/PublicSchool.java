package dependent;

import dependency.Coach;
import dependency.Teacher;

public class PublicSchool implements School {
	private Teacher subjectTeacher;// mandatory
	private Coach sportsCoach;// optional

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

	@Override
	public void organizeSportsEvent() {
		System.out.println("organizing sports event !");
		System.out.println(sportsCoach.getDailyWorkout());//using the dependency to exec B.L
	}

//In case of optional dependencies - setter based D.I
	public void setSportsCoach(Coach sportsCoach) {
		System.out.println("in setter - coach");
		this.sportsCoach = sportsCoach;
	}

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
