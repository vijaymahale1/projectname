package Polymorphism;

public class O_H1 extends O_M1 {

	void v1() {
		
		System.out.println("hii");
	}
	
	
	public static void main(String[] args) {
		
		
		O_M1 b=new O_M1();
		b.v1();
		O_H1 c=new O_H1();
		c.v1();

	}

}
