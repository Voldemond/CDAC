import java.util.*;

public class Question_1{
	public static void main(String args[]){
	int n ;
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();
	if(n > 0 ) {
			System.out.println("it is a positive No.");
		}
		else if (n <0) {
				System.out.println("it is a negative no." );
			}
			else {
				System.out.println("it is a Zero");
			}
	}
}