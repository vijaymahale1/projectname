package Abstraction;

abstract class v1{
	
	
	abstract public void m1() ;

	
	void m2() {
		
		
		System.out.println("ok");
	}
	
	
	
}

class S2 extends v1{
	
	public void m1() {
		
		System.out.println("hiii vijay");
		
	}
	
}

public class S1 extends v1  {
	
	
	public void m1() {
		
		System.out.println("helllo");
	}

	public static void main(String[] args) {
		
		
		v1 b=new S2();
		b.m1();
		
		
		
		S1 c=new S1();
		c.m2();
		
		c.m1();
	     

	}

}
