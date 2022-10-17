package practice;

public class ss1 {

	public static void main(String[] args) {
		
		String s1=new String("vijay");
		
		s1.concat("mahale");
		
		System.out.println(s1);// print vijay only beacause string is immutable
		// not change object
		
		
		StringBuffer s2=new StringBuffer("vijay");
		
		s2.append("mahale");
		
		System.out.println(s2); //String is mmutable  change object


	}

}
