package Exception_handling;

public class b1 {

	public static void main(String[] args) {
	
		try {
		int a=10;
		int b=0;
		
		int c=a/b;
		
		System.out.println(c);
		
		
		}
		
		catch(Exception b) {
			
			System.out.println(b);
			
			
		}
		
		finally {
			
			System.out.println("hello");
		}
		
		

	}

}
