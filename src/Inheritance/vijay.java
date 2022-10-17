package Inheritance;

class A1{
	
	void run() {
		
		System.out.println("can run");
	}
}


public class vijay extends A1 {
     
	void walk() {
		
		System.out.println("can walk");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vijay a=new vijay();
		a.run();
		a.walk();
		
		

	}

}
