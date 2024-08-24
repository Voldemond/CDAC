class Person
{
    String name;
    String address;
    static String COUNTRYNAME;
    
	{
		name= "ABC";
		address= "XYZ";
	}

    static
    {
        COUNTRYNAME = "India";
    }
    
   Person(){	}

    Person(String a, String b){
	name = a;
	address = b;
	}

    void showData()
    {
        System.out.println("Name of Person : " + name);
        System.out.println("Address of person : " + address);
        System.out.println("Country of person : "+  COUNTRYNAME);
    }

	void showData(){
	 System.out.println("Name of Person : " + name);
	}
    
}

class PersonDemo{
public static void main(String arg[])
    {
        Person person1 =  new Person("Ram","MH");
        person1.showData();
        
        Person person2 =  new Person("Shyam","MH");       
        person2.showData();

	  Person person3 =  new Person();       
        person3.showData();
    }
}