package Inheritance_multilevel;

// multilevel Inheritance---chain parent and child

class v1{               // R1
	
	public void R1() {
		
		System.out.println("i am vijay");
	}
	
}

class v2 extends v1{      // R1 and R2
	
	public void R2() {
		
		System.out.println("i am Good");
	}
	
}

public class pp1 extends v2 {     // R1,R2,R3
	
	public void R3() {
		
		System.out.println("how are You");
	}

	public static void main(String[] args) {
	      
		
		pp1 a= new pp1();
		
		a.R1();
		a.R2();
		a.R3();
		///////////////////////////////
	  v2 aa=new v2();
	  
	  aa.R1();
	  aa.R2();

	}

}
