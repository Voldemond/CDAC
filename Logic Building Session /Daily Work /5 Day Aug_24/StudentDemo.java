class Student{

int id;
String name;
String address;
float marks;
static String iName = "CDAC Mumbai";
static int year = "2024";
static string batch = "Aug";



Student(){}

Student (int id){
this.id = id;
}

Student(int a , String b, String c, float d){
id = a;
name = b;
address =  c;
marks = d;
}


void display(){
System.out.println("Student Id " + id);

System.out.println("Institue " + iName);
}

static void print(){
System.out.println("Student Id " + id);

System.out.println("Institue " + iName);
}



}

class StudentDemo{

public static void main(String[] args){
Student obj1 = new Student();
Student obj2 = new Student(1);
obj1.display();
obj2.display();



}

}


/*
class - blueprint    

class -  inst. var 
	static var  -- class
	methods 
	constr. 
	inst block 
	static block

object - instance  -- 
*/



















