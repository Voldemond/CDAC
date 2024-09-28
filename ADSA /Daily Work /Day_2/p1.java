package Day_2;

public class p1 {
	
	//Recursion                    0 1 1 2 3 5 8 13 21 
	static int fib(int n ) {
		if ( n <= 1 ) {
			return n ;
		}
		return fib (n-1)+fib(n-2);
	}
	public static void main(String []args) {
		
		int num = 100 ; 
		
		for(int i=1 ; i <= num ; i++ ) {
			System.out.println(fib(i)+" ");
		}
	}
}
