class PersonOverloading
{
    String name;
    String address;
   
    
	
   PersonOverloading(){	}

    PersonOverloading(String a, String b){
	name = a;
	address = b;
	}

    void showData()
    {
        System.out.println("Name of Person : " + name);
        System.out.println("Address of person : " + address);
      
    }

	String showData(String a){
	System.out.println("parameter value : " + a);
	 System.out.println("Name of Person : " + name);

	return a;
	}
    
	/*String showData(String a){
	System.out.println("parameter value : " + a);
	 System.out.println("Name of Person : " + name);

	return a;
	}*/
	// method showData(String) is already defined



	public static void main(String arg[])
   	 {
        PersonOverloading person1 =  new PersonOverloading("Ram","MH");
        //person1.showData();
	person1.showData("abc");
        
	 PersonOverloading person2 =  new PersonOverloading();
       // person2.showData();
	person2.showData("abc");
    	}
}