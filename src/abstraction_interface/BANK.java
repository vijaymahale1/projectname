package abstraction_interface;

interface interp1{
	
	default void s1() {
		
		System.out.println("hello");
	}
	
   void SBIBANK();
	
}

interface interP2{
	
	void ICICIBANK();
}

interface interP3{
	
	void AXISBANK();
}

   
public class BANK implements interp1,interP2,interP3 {
	
	
	public void SBIBANK() {
		
		System.out.println("SBIBANK interest rate 7%");
	}
    public void ICICIBANK() {
    	
    	System.out.println("ICICIBANK interest rate 3%");
    }
    
    public void AXISBANK() {
    	
    	System.out.println("AXISBANK interest rate 3.50%");
    }
	public static void main(String[] args) {
		
		BANK a=new BANK();
		
		a.SBIBANK();
		a.ICICIBANK();
		a.AXISBANK();
		
	
		
		

	}

}
