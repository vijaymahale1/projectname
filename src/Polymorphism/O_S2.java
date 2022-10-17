package Polymorphism;

public class O_S2 extends O_S1 {

	
	void k2(String b) {
		
		System.out.println("Engineer");
	}
	public static void main(String[] args) {
		
		
		O_S1 d=new O_S1();
		
		d.k1("vijay");
		
		O_S2 c=new O_S2();
		c.k2("mahale");
		

	}

}
