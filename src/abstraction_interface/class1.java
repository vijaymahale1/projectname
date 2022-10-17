package abstraction_interface;

interface inter1{
	
	void n1();// public abstract
	
	int a=10; // public  static final before int a=10; by default consider
	
	
	// java 8th version
	default void m2() {
		
		System.out.println("m2");
	}
	
	public static void m3() {
		
		
	}
	
	// java 9th version
	private void m4() {
		
		
	}
}


public class class1 {

	public static void main(String[] args) {
		
		

	
		

	}

}
