package abstraction_interface;

interface interm1{
	
	
	void m2();
	
	void m5();
}

interface interm3{
	
	void m4();
	
  static void m6() {
	  
	  System.out.println(" nature");
  }
  
  private void m7() {
	  
	  System.err.println("prakash");
  }



}


public class ok1 implements interm1,interm3{
	
	public void m2() {
		
		System.out.println("how are u");
	}
	
	public void m4() {
		
		System.out.println("hii");
	}
	
	public void m5() {
	System.out.println(" helloo");
	
	}
	
	

	public static void main(String[] args) {
		
	   ok1 s1=new ok1();
		s1.m2();
		s1.m4();
		s1.m5();
        interm3.m6();
       
       
       

		
	
	
	

	}

}
