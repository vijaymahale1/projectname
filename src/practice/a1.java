package practice;

public class a1 {

	public static void main(String[] args) {
	
		String s1=new String("vijay");
		String s2=new String("VIJAY");

		System.out.println(s1.equals(s2));//-->false

		System.out.println(s1.equalsIgnoreCase(s2));;//-->True
		
		
	}

}
