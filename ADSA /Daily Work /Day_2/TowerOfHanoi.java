package Day_2;

public class TowerOfHanoi {
	
	static void toh(int n , char s , char inter, char d )
	//toh
	{
		if (n==1 )// if only one disk 
			System.out.println("Disk from " +s +" to "+d);
		
		else {
			toh(n-1,s,d,inter);
			System.out.println("Disk from " +s+ " to "+d);
			toh(n-1, inter ,s,d);
		}
	}
	public static void main(String args[]) {
		int n=3 ;
		toh(n,'A','B','C');
	}
}
