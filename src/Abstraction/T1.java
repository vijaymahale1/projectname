package Abstraction;

abstract class T{
	
	
	abstract void d1();
}

class P1 extends T{
	
	void d1() {
		
		System.out.println("Good morning");
	}
	
}

class P2 extends T{
	
	
	void d1() {
		
		System.out.println("Good night");
	}
}

public class T1 extends T{
	
	void d1() {
		
		System.out.println("Good afternoon");
	}

	public static void main(String[] args) {
		
		T K=new P1();   // change refarence P1 to T
		P2 K1=new P2();
		T1 k3=new T1();
		
		K.d1();
		K1.d1();
		k3.d1();

	}

}
