package Encapsulation;

public class Facebook {
	
	private String Password;
	
	public void setloginbutton(String Password) {
		 
	this.Password=Password;
		
	}
	
	public String getloginbutton() {
		
		return Password;
	}

	public static void main(String[] args) {
		
		Facebook d=new Facebook();
		
		d.setloginbutton("vijay@45658");
		
		System.out.println(d.getloginbutton());

	}

}
