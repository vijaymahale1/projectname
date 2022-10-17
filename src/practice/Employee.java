package practice;

public class Employee{
	
	
	private int Employeeid;
  
	
	public void setEmployeeid(int Employeeid) {
		
		this.Employeeid=Employeeid;
	}

  public int getEmployeeid() {
	  
	  return Employeeid;
  }
	
	public static void main(String[] args) {
	
		
		Employee a=new Employee();
		
		a.setEmployeeid(1250);
		
		System.out.println(a.getEmployeeid());

	}

}
