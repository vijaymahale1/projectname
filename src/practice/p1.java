package practice;

public class p1 {

	public static void main(String[] args) {
		
		
		String s1=new String("vijay");
		s1.concat("mahale");
		
		System.out.println(s1);//"vijay" =string is immutable
		
		
		
		StringBuffer s2=new StringBuffer("vijay");
		s2.append("mahale");
		
		System.out.println(s2);//"vijaymahale"=immutable
		

	}

}
