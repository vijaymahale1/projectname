package Inheritance;

class bird1{
	
	
	public void fly() {
		
		System.out.println("can fly");
	}
	
	
}

public class parrot1 extends bird1 {
	
	void speek() {
		
		System.out.println("can speek");
	}

	public static void main(String[] args) {
	
		
		parrot1 a=new parrot1();
		
		a.fly();
		a.speek();

	}

}
