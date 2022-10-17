package practice;

public class vijay {
	
	
	private int OTPnumber;
	
	public void setotpnumber(int OTPnumber) {
		
		this.OTPnumber=OTPnumber;
		
	}
	
	
	public int getotpnumber() {
		
		return OTPnumber;
	}

	public static void main(String[] args) {
		
		vijay a=new vijay();
		
		a.setotpnumber(1255);
		
		
		System.out.println(a.getotpnumber());

	}

}
