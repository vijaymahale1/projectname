package practice;

abstract class k3{
	
	abstract void m1();
}

class k2 extends k3{
	
	
	void m1() {
		
		System.out.println("so nice");
	}
	
}

public class k1 extends k3{
	
	
	void m1() {
		
		System.out.println("God always Great");
	}

	public static void main(String[] args) {
		
		
	 k3 a= new k2();
		
	k3  b=new k1();
		
		
		a.m1();
		b.m1();

	}

}
