package Encapsulation;

public class class_employee {
	
	private int empid;
	
	public void setempid(int eid) {
		
		empid=eid;
		
	}
	
	
	public int getempid() {
		
		return empid;
	}
}
 class company
 
 {  
	  public static void main(String[] args) {
		 
		 class_employee a=new class_employee();
		 
		 a.setempid(200);
		 System.out.println(a.getempid());
		 
		 
	 }
 }
