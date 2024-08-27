import java.util.*;

public class Question_2{
	public static void main (String args[] ){
		Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
		
		if (n % 2 == 0 ){
			System.out.println("Even");
		}
			else {
				System.out.println("Odd");
			}
	}
}