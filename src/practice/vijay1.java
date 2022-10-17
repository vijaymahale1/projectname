package practice;

abstract class s2{
	
	abstract void m1();
	
	public void m2() {
		
		System.out.println("hello");
	}
}


class s1 extends s2{
	
	
	public void m1 () {
		
		System.out.println("Good");
		
	}
	
}

public class vijay1 extends s2{
	
	
	public void m1() {
		
		System.out.println("person ");
	}

	public static void main(String[] args) {
		
		
		s1 a=new s1();
		vijay1 b =new vijay1();
		
		a.m1();
		
		
		b.m1();
		a.m2();

	}

}
