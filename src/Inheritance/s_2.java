package Inheritance;

public class s_2 extends s_1 {

	
	void k2() {
		
		System.out.println("fine");
	}
	
	class s_3 extends s_2{
		
		void k3() {
			
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		s_2 a=new s_2();
		a.k1();
		a.k2();
		
		

	}

}
