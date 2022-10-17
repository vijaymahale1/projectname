package Polymorphism;

public class Test1 {
	
	
	// ambiguity problem CREAT BEACAUSE same Argument,m1(),m2()
	
// then compiler confuse which method call
	
	void m1() {
		
		System.out.println("vijay");
	}
	
	
	void m2() {
		
		System.out.println("mahale");
	}

	public static void main(String[] args) {
		
		
		Test1 a=new Test1();
		

	}

}
