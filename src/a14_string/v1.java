package a14_string;

public class v1 {

	public static void main(String[] args) {
		 
		
		String s1=new String("vijay");
		
		s1.concat("mahale");
	
		System.out.println(s1);
		
		
		StringBuffer s2=new StringBuffer("sorry");
		
		s2.append("vijay");
		
		System.out.println(s2);
		
		
		
		String a1=new String("vijay");
		
		String a2=new String("vijay");
		
		System.out.println(a1==a2);
		
		System.out.println(a1.equals(a2));
		
		
		StringBuffer a3=new StringBuffer("vijay");
		
		StringBuffer a4=new StringBuffer("Mahale");
		
		System.out.println(a3==a4);
		
		System.out.println(a3.equals(a4));
		
		
		
		String aa1=new String("sucess");
		
		String aa2=new String("BigSucess");
		
		System.out.println(aa1=aa2);//double equal operator
		
		System.out.println(aa1.equals(aa2));// content comparison method
		
		
		
		
				
				
				

	}

}
