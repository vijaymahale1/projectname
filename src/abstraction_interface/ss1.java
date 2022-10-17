package abstraction_interface;
interface interss1{
	
         void m1();
	
}


public class ss1 implements interss1 {
	
	public void m1() {   // override m1
		
		System.out.println("hundred persent abstraction");
		
	}

	public static void main(String[] args) {
	  
		
		ss1 b=new ss1();
		
		b.m1();

	}

}
