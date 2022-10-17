package practice;

public class a2 {

	public static void main(String[] args) {
		
		
		char[] a={'v','i','j','a','y'};
		
		System.out.println(a);
		
		String  a1=new String  ("TOM");
		a1.concat (" jerry");
		
		System.out.println(a1);// String is immutable because previous object can not change
		
		
		//1)Equal ignorecase
		
		String s1="vijay";
		String s2="VIJAY";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		
		String d1="sanket";		
		String d2="SANKET";
		
		if(d1.equalsIgnoreCase(d2)){
			
			System.out.println("Thete");
			
		}else {
			
			System.out.println("Snketthete");
		}
		
		//2)Equal case
		String a2="vijay";
		String a3="VIJAY";
		
	System.out.println(a2.equals(a3));
	
	
	if(a2.equals(a3)) {
		
		System.out.println("mahale");
	}else {
		
		System.out.println("vijaymahale");
	}
		
	//Findout Length
	
	
	String b1="MAHARASHTRA";
	
	int c=b1.length();
	
	System.out.println(c);
	
	
	String h1="vishawanathanand";
	int g=h1.length();
	
	System.out.println(g);
	
	
	String a6="vijay";
	int a7=a6.length();
	System.out.println(a7);;//5
	
	
	String r1="shivaji";
	char r2=r1.charAt(3);
	
	System.out.println(r2);
		
		
		
		
		

	}

}
