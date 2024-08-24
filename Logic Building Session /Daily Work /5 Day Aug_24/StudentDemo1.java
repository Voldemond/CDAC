class Student1{

int id;
String name;
String address;
float marks;
static String iName;

	{
		this.id = 1;
		System.out.println("Inside INIT");
	}

	static{
	
		System.out.println("Inside Static");
	}

	Student1(){
		this.id = 2;
		iName = "CDAC";
		System.out.println("Inside Constr.");
	}

	static void display(){
		System.out.println("Inside Display()");
	}
	
	void display(int i){
	System.out.println(i);

	}

}
class StudentDemo1{
	public static void main(String[] args){
	
	Student1 obj1 = new Student1();
	/*Student1 obj2 = new Student1();
	Student1 obj3 = new Student1();

	System.out.println(obj1.id);
	System.out.println(obj2.id);
	System.out.println(obj3.id);
	System.out.println(obj1.iName);
	System.out.println(obj2.iName);
	System.out.println(obj3.iName);
	*/	
	
	Student1.display();  // static
	//Student1.display(1); // non-static
	obj1.display(1);

	

	}
}




















