package Encapsulation;

public class SBI {
	
	private String Employee;
	
	public void setEmployee(String Employee) {
		
		 this.Employee= Employee;
	}
	
	
	public String getEmployee() {
		
		return Employee;
	}

	public static void main(String[] args) {
		
		SBI a=new SBI();
		
		a.setEmployee("vijay mahale");
		
		System.out.println(a.getEmployee());
		
		

	}

}
