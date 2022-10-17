package Exception_handling;

public class a1 {

	public static void main(String[] args) {
		
		try {  // always execute Risk code
			
		int a=10;
		int b=0;
		int c;
		
		c=b/a;
		
		System.out.println(c); //ArithmeticException
		
		}
		
		catch(Exception e) { //Exception Handling code
			
			System.out.println(e);
		}
		
		finally {   // finally clean up code 1)close database connection
			
			                           //    2)close already open file
			
			System.out.println(" i am finally block");
		}
	
	
	
	}
	
	
}
