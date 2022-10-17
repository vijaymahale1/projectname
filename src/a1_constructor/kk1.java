package a1_constructor;

public class kk1 {
	 
	String Empoloyeename;
    int Salary;
    
    kk1(String Empoloyeename,int Salary){
    	
    	this.Empoloyeename=Empoloyeename;
    	this.Salary=Salary;
    	
    	System.out.println(this.Empoloyeename+" | "+this.Salary);
    	
    	}

	public static void main(String[] args) {
		
		System.out.println("Empoloyeename "+"      | "+" Salary");
		
		
		kk1 a=new kk1("vijay Laxman Mahale", 70000);
		kk1 a2=new kk1("Sanket Anil Thete" , 75000);
		kk1 a3=new kk1("Kaustubh..kulkarani",77000);
		kk1 a4=new kk1("Krishana.....jadhav",70000);
		kk1 a5=new kk1("Priyanka..... Deo",  70000);
		kk1 a6=new kk1("Prakash......Jadhav",70000);

	}

}
