package Abstraction;

abstract class product {
	
	abstract void test();
	
	public void m1() {
		
		System.out.println("nice");
	}
	
}


class Orange extends product {
	
	void test(){
		
		System.out.println("very sweet");
		
		}

	public static void main(String[] args) {
		
		Orange b=new Orange();
		
	
		
		
		b.test();
		b.m1();
		
		
		
		
		
		
	

	}

}
