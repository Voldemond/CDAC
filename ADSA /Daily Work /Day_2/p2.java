package Day_2;

public class p2 {
	static void display(String str , String res)	{
		if (str.length()==0) {
			System.out.println(res+ "");
			return ;
		}
		for(int i =0 ; i < str.length(); i++) {
			char ch = str.charAt(i); // ABC- > A 
			String ros = str.substring(0,i)+str.substring(i+1);
			display(ros,res+ch);
		}
		 
	}
	public static void main(String a[]) {
		String s="ABCD";
		display(s,"");
	}
}
