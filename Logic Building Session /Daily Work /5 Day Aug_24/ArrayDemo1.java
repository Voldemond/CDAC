import java.util.Scanner;

class ArrayDemo1{
public static void main(String arg[]){

	Scanner sc = new Scanner(System.in);
	/*sc.nextInt();
	  sc.nextFloat();
	sc.next();
	sc.nextLine();
	sc.nextLong();
	char c = sc.next().charAt(0);  // pls enter 1st value
	*/


	int arr[] = new int[5];

	// for input
	for(int i = 0; i<5; i++){
		System.out.println("Pls enter "+ (i+1) +"st value");
		arr[i] = sc.nextInt();
	}

	// for output
	for(int i = 0; i<5; i++){
		System.out.println(arr[i]);
	}


	

	


}







}