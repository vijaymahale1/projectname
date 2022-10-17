package Hierarchical_Inheritance;
class s1{
	
	void work() {
		
		System.out.println("he is hard work");
	}
}
class ss2 extends s1{
	
	void great() {
		
		System.out.println("he is great person");
	}
}

public class ss1 extends s1 {
	
	void good() {
		
		System.out.println("he is good person");
	}

	public static void main(String[] args) {
		
		ss1 h=new ss1();
		
		h.work();
		h.good();
		
		ss2 k=new ss2();
		
		k.work();

	}

}
