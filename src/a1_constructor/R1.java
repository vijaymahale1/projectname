package a1_constructor;

public class R1 {
	
	String Employee;
	
	int id;
	
	
	R1(String Employee,int id){
		
		this.Employee=Employee;
		this.id=id;
		
		System.out.println(this.Employee+" | "+this.id );
	}

	public static void main(String[] args) {
		
		
		
		System.out.println("Employee"+" |"+" id ");
		
		System.out.println("-------------------");
		
			R1 b= new R1("vijay",143);
			R1 b1= new R1("Sanket",13);
			R1 b2= new R1("Prakash",143);

	}

}
