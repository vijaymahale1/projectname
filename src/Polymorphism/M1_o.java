package Polymorphism;

public class M1_o {
//  method overloading
	
	void v1() {
		
		System.out.println("hello");
	}
	
	
	void v1(int a){      //(value given Argument then object pass then print
		
		                     //because in this case Argument had different 
		
		System.out.println("hii");
		
		
	}
	
	
	
	public static void main(String[] args) {
	

		
		M1_o b=new M1_o();
		
		b.v1();
		b.v1(10);
	
	}

}
