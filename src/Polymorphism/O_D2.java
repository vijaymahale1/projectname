package Polymorphism;

public class O_D2 {

	
	void D2(String a, int b) {
		
		System.out.println("aregument");
	}
	public static void main(String[] args) {
	
		
		O_D1 a=new O_D1();
		a.D1("yes", 10);
       O_D2 b=new O_D2();
       
       b.D2("yes", 20);
	}

}
