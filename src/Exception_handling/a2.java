package Exception_handling;

public class a2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try {
		int a=0;
		int b=10;
		int c;
		
		c=b/a;
		
		System.out.println(c);
		
	}
		catch(ArithmeticException e) {
			
			System.out.println(e);
			
		}
		
		
		finally {
			
			System.out.println(" i am vijay");
			
			
		}
	}
}
