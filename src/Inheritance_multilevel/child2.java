package Inheritance_multilevel;

class parents{       //Hierarchical Inheritance one parents and two Child 
	                // two child acquired all behavior and property by parent class
	                // but two child not share itself behavior and property
	void Office() {
		
		System.out.println("hard work");
	}
	
}
 class child1 extends parents{
	 
	 void school() {
		 
		 System.out.println("Learing");
	 }
 }
	


public class child2 extends parents {
	
	void college() {
		 System.out.println("Enjoy");
		
	}

	public static void main(String[] args) {
		
		child2 a=new child2();
		child1 b=new child1();
		
		b.school();
		a.Office();
		a.college();
		
		
		
		

	}

}
