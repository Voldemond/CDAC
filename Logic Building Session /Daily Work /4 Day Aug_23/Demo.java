class Laptop{
	int memory;
	String modelName;
	String processor;
	String os;
	float price;
	
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

public class Demo{
	public static void main(String args[]){
		int a=10;  // primitive DT
		// user defined data type
		Laptop laptopObj = new Laptop();   // default, 
		//classN  
		//laptopObj = ref of obj
		//new is a keyword , used allocate memory
		// laptop();
		
		
		
		
		
		
		
		laptopObj.sound();
		laptopObj.typeNotepad();
		System.out.println(laptopObj.typeNotepad());
		
		
		
	}
	
}




























