package Hierarchical_Inheritance;

class H1{
	
	public void v1() {   // v1
		
		System.out.println("I am simple");
	}
	
	
}

class H2 extends H1{   // v1,v2
	
	public void v2() {
		
		System.out.println("I am honest pesron");
	}
	
}

public class H3 extends H1 {  // here not extends H2 because only one parent(H1) and
	                        // two child H2,H3
	
	public void v3() {               // v1,v3
		
		System.out.println("i am clever");
	}

	public static void main(String[] args) {
		
		 H3 a=new H3();
		 
		 a.v1();
		 a.v3();
	/////////////////////////////////////////	 
		 H2 aa=new H2();
		 
		 aa.v1();
		 aa.v2();
		 
		 

	}

}
