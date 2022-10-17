package Encapsulation;

public class Bank1 {
   
	private int accountnumber;// non static method
	
	public void setaccountnumber(int accountnumber) {
		
		this.accountnumber=accountnumber;
	}
	
	public int getaccountnumber() {
		
		return accountnumber;
		
	}
	public static void main(String[] args) {
	
		
		Bank1 s=new Bank1();
		
		s.setaccountnumber(1545555555);
		
		System.out.println(s.getaccountnumber());

	}

}
