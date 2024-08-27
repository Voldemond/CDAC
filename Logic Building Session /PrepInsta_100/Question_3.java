import java.util.*;
public class Question_3{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			int result=0 ;
			while (n>0){
				result = result + n ; 
				n--;
			}
				System.out.println(result);
	
			
	}
}