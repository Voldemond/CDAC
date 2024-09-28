package Day_1;

public class p4 {
	static int fact(int n) {
		if (n<=1 )
			return 1 ; 
		else
			return n *fact(n-1);
	}
	public static void main(String a[]) {
		System.out.println(fact(5));
	}
}
