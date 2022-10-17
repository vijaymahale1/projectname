package Inheritance_multilevel;

class parent {                     // Honest
	
	void Honest() {
		
		System.out.println(" I have honest");
	}
}

class B1_B extends parent{                       // Honest, Clever
	
	
	void clever() {
		
		System.out.println("i am clever");
	}
}

public class A1_A extends B1_B {               // Honest ,Clever,petience

	void petiense() {
		
		System.out.println("i have petience");
	}
	public static void main(String[] args) {
		
		
		A1_A Qualities=new A1_A();
		Qualities.Honest();
		Qualities.clever();
		Qualities.petiense();
		

	}

}
