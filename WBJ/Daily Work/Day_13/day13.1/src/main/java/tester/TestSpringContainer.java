package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.PublicSchool;

public class TestSpringContainer {

	public static void main(String[] args) {
		// start SC (Spring Container) in a standalone application , 
		//using xml based instructions , loaded from run time class path
		try (ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("bean_config.xml")) {
			System.out.println("SC up n running !");
			//exec B.L - manage acads
			PublicSchool school1=
					context.getBean("public_school", PublicSchool.class);
			//B.L
			school1.manageAcademics();
			PublicSchool school2=
					context.getBean("public_school", PublicSchool.class);
		
			System.out.println(school1 == school2);//false since it's prototype
		} //JVM - context.close() => SC shutting down --> 
		//checks for singleton beans -> invokes destroy method , if present -> 
		//bean will be marked GC
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
