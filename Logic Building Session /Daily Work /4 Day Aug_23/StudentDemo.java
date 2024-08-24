class Student{
	int id;
	String name;
	float marks;
	long mob;
	String address;
	static String instituteName= "CDAC Mumbai";
	
	Student(){}
	
	
	Student(int a, String b, float c, long d, String e){
		id = a;
		name = b;
		marks = c;
		mob = d;
		address = e;
		
	}
	
	float displayMarks(){
		
		return marks;
	}
	
	void calculatePercentage(){
			System.out.println("percentage");
	}
	
	void displayDetails(){	
		System.out.println(id+ " " +name+ " "+address+ " "+mob+" "+marks);
	
	}




}

class StudentDemo{
	public static void main(String args[]){
		int a = 10;
		//System.out.println(Student.instituteName);
		Student studentObj1 = new Student();
		Student studentObj2 = new Student(1,"Pratik",70.0f,9876544321L,"jalgaon");
		
		
		System.out.println(studentObj1.name);
		
		System.out.println(studentObj1.instituteName);
		
		System.out.println(studentObj2.name);
		
		System.out.println(studentObj2.instituteName);
		
		/*studentObj1.instituteName = "cdac mumbai PG-DAC";
		System.out.println("After update");
		System.out.println(studentObj1.instituteName);
		System.out.println(studentObj2.instituteName);
		*/
		
		//studentObj1.name = "rahul";
		//studentObj2.name = "vipul";
		
		
		
	}
	
	
}