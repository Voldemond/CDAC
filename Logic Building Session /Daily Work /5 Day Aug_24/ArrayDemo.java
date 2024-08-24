import java.util.Scanner;

class ArrayDemo{

// array is used to store similar type of data.

// datatype nameOfArray[] = {};
// dt name[] = new dt[];
// dt[] n = new dt[];

 //ex. int a[] = {1,2,3,4};
	//int a[] = {1.0,1,2 3}  error

// [] == subscript operator


public static void main(String arg[]){

	Scanner sc = new Scanner(System.in);

	/*int arr[] = {1,2,3};
	System.out.println(arr);  // hashcode
	System.out.println(arr[0]);   // 1
	System.out.println(arr[1]);   // 2
	System.out.println(arr[2]);   // 3	
	*/



	/*float arr1[] = {1.0f,2.0f,3.0f};

	System.out.println(arr1);  //hashcode
	System.out.println(arr1[0]+ " " + arr1[1]+" "+arr1[2]);*/


	int arr[] = new int[5];
	/*System.out.println(arr[0]); 
	System.out.println(arr[1]); 
	System.out.println(arr[2]); 
	System.out.println(arr[3]); 
	System.out.println(arr[4]); */

	/*float arr1[] = new float[5];
	System.out.println(arr1[0]); 
	System.out.println(arr1[1]); 
	System.out.println(arr1[2]); 
	System.out.println(arr1[3]); 
	System.out.println(arr1[4]); */

	// for input
	for(int i = 0; i<=5; i++){
		arr[i] = 10;
	}

	// for output
	for(int i = 0; i<5; i++){
		System.out.println(arr[i]);
	}

	


}







}