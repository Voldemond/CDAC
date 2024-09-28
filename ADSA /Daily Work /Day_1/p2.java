package Day_1;

public class p2 {
	static int i = 0 ;
	static void show () {
		
		++i ; 
		if(i<5) {
			System.out.println("Hi there !!!");
			show()	;
		}
		
		}
	public static void main(String args []	) {
		show()	;
	}
}
