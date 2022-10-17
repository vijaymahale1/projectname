package Inheritance;
// single Inheritance child class acquired all behavior and property from parent
//class 
class Amitabh{
	
	
	void A1() {
		
		
		System.out.println("A1");
	}
}


public class Abhishak extends Amitabh{
	
	
	void  A2() {
		  System.out.println("A2");
		
	}

	public static void main(String[] args) {
		

		
		 Abhishak a =new Abhishak();
		 
		
		 a.A1();
		 a.A2();
		 
		 
		 
		 
		 
		 
	}

}
