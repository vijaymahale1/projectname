package abstraction_interface;

interface inter2{
	
	void n5();
	
	void n6();
	
}

interface inter3{
	
	void n7();
	
}

public class class2 implements inter2,inter3 {
	
	public void n5() {
		
		System.out.println("i am n5");
	}
	
	public void n6() {
		
		System.out.println("i am n6");
	}
	
	public void n7() {
		
		System.out.println("i am n7");
	}
	

	public static void main(String[] args) {
	
		inter2 c=new class2();
		
		c.n5();
		c.n6();
		
		inter3 cc=new class2();
		
		cc.n7();
		
	
		
		
		

	}

}
