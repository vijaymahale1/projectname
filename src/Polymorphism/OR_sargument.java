package Polymorphism;
// Overriding method

//1.same method name

//2.Different class name

//3.same argument//i) no of argument
                // ii)sequence argument not change sequence
               // iii)type argument

class OV{
	
	void m1() {
		
		
		System.out.println("vijay");
	}
	
}

public class OR_sargument extends OV {  // Archive IS A relationship

	
	public void m1() {
		
		System.out.println("kaustubh");
	}
	
	
	
	public static void main(String[] args) {
		
          OR_sargument a=new OR_sargument();
          
     //     OV b=new OV();
     //     b.m1();
          a.m1();
         
          
          
          
	}

}
