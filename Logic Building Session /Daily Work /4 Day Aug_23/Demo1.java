class Laptop{
	int memory;
	String modelName;
	String processor;
	String os;
	float price;  // instace variable
	
	Laptop(){    // zero parameter
		memory=8;
		modelName = "HP";
		processor = "i5";
		os="windows";
		price=50000.0f;
	}
	
	Laptop(int a , String b){  // two parameter
		memory = a;
		modelName = b;
	}
	
	Laptop(int a, String b, String c, String d, float e){  // 5 parameter
		memory = a;
		modelName = b;
		processor =  c;
		os = d;
		price = e;
		
	}
		
	void clickPhoto(){
		System.out.println("inside ClickPhoto()");	
	} 
	
	String typeNotepad(){
		return "Return from typeNotepad()";
	} 
	
	void sound(){
		System.out.println("inside sound()");
	}
}

public class Demo1{
	public static void main(String args[]){
		int a=10;  // primitive DT  // local var
		// Object are stored on Heap area
		
		Laptop laptopObj1 = new Laptop();  
		Laptop laptopObj2 = new Laptop(4,"Dell","I7","Win", 60000.0f);
		Laptop laptopObj3 = new Laptop(16,"Asus");
		
		System.out.println(laptopObj1.memory);
		System.out.println(laptopObj1.modelName);
		System.out.println(laptopObj1.price);
		
		System.out.println(laptopObj2.memory+ " " + laptopObj2.modelName+" "+laptopObj2.price);
		System.out.println(laptopObj3.memory+ " " + laptopObj3.modelName+" "+ laptopObj3.price);
		
		
		
		
		//laptopObj1.clickPhoto();
		//laptopObj2.clickPhoto();
		
		
		
		
	}
	
}




























