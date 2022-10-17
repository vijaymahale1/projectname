package Polymorphism;

public class M3_o {
	//overloading
  //sequence change of Argument
	
	// compiler not confused then object directly call method one
	
	void k1(int a, String b) {
		
		System.out.println("class");
	}
	
	void k2(String b,int a) {
		
		System.out.println("object");
	}

	public static void main(String[] args) {
	
     
		M3_o d=new M3_o();
		
		d.k1(10, "vijay");
	}

}
