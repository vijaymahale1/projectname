package practice;

class d2{
	
	void m1(int a) {
		
		System.out.println("helloo");
	}
}


public class d1 extends d2  {
	
	void m1(int a) {
		
		System.out.println("vijay");
	}
	

	public static void main(String[] args) {
		
		
		d1 b=new d1();
		d2 c=new d2();
		
		
		
		b.m1(10);
		
		
		

	}

}
