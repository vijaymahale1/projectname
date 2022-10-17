package a1_constructor;

public class ss1 {

	
	String name;
	int marks;
	
	public ss1 (String name,int marks) {
		
		  this.name=name;
		  this.marks=marks;
		  
		  System.out.println(this.name+" & "+this.marks);
		
		
		
	}
	public static void main(String[] args) {
		

		ss1 k1=new ss1("vijay",1106);
	}

}
