class Student1{
	int id;
	String name;
	float marks;
	long mob;
	String address;
	static String instituteName= "CDAC Mumbai";
	
	Student1(){}
	
	
	Student1(int a, String b, float c, long d, String e){
		id = a;
		name = b;
		marks = c;
		mob = d;
		address = e;
		
	}
	
	static void instituteName1(){
		System.out.println(instituteName);
		System.out.println(name);
		
	}
		
	 float displayMarks(){
		 System.out.println(instituteName+" PG_DAC AUG24");
		int grace = 1;
		marks+=grace;
		
		return marks;
	}
	
	void calculatePercentage(){
			System.out.println("percentage");
	}
	
	void displayDetails(){	
		System.out.println(id+ " " +name+ " "+address+ " "+mob+" "+marks);
	}

}

class StudentDemo1{
	public static void main(String args[]){
		Student1 obj1 = new Student1();
		//System.out.println(obj1.displayMarks());
		obj1.instituteName1();
		
		Student1 obj2 = new Student1(1,"abc",70.0f,9L,"mumbai");
		//System.out.println(obj2.displayMarks());
		obj2.instituteName1();
		
		
		
	}
	
	
}