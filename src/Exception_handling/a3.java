package Exception_handling;

public class a3 {

	public static void main(String[] args) {
       
	try {
    int a=20;
    int b=0;
    int c;
    
    
    c=a/b;
    
    System.out.println(c);
	}
	
	catch(ArithmeticException c) {
		
		System.out.println(c);
	}
	
	
	finally {
		
		System.out.println("hhiii");
	}
	
	System.out.println("i am singer ");
	}

}
