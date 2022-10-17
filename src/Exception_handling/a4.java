package Exception_handling;

public class a4 {

	public static void main(String[] args) {
	 try {
		int a=0;
		int b=60;
		int c;
		
		c=b/a;
		System.out.println(c);
		
	}
	 
	 catch(ArithmeticException d) {
		 
		 System.out.println(d);
	 }
	 
	 finally {
		 
		 System.out.println("hii kaustubh ");
		 
		 System.out.println("so nice");
	 }
	  
	 System.out.println("ok");
	}
	
	}
