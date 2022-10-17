package practice;

interface intervijay{
	
	
	abstract void cash();
	
	void payment(); 
}


interface interSanket{
	
	void cash();
	
	void payment1();
	
}

public class ATM implements intervijay,interSanket{
	
	
	public void cash() {
		
		System.out.println("SBI in creadit");
	}
	
	
	public void payment() {
		
		System.out.println("Axis Bank");
	}
	
	public void payment1() {
		
		System.out.println("ICICI Bank");
	}
	
	
	

	public static void main(String[] args) {
		
		
		ATM s1= new ATM ();
		
		
		s1.cash();
		s1.payment();
		s1.payment1();
		

	}

}
