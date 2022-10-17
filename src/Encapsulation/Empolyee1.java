package Encapsulation;

public class Empolyee1 {

	
	private int empid;
	
	public void setempid(int empid){
		
		this.empid=empid;
		
}
	public int getempid(){
		
		return empid;

	}
	public static void main(String[] args) {
	
		Empolyee1 b=new Empolyee1();
		
		b.setempid(500);
		
		System.out.println(b.getempid());
		
		
		
		

	}

}
