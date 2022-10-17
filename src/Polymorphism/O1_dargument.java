package Polymorphism;
//method overloading 

// 1.same method
// 2.same class
// 3.Different argument( data types of argument)i)no argument
                                             //ii)sequence of argument can change
                                            //iii)Types of Argument
public class O1_dargument {
	
	
	public void java(String email,int pass) {
		
		System.out.println("java Developer");
	}
	
	
	public void java(int mobile ,int pass) {
		
		
		System.out.println("java Devloper");
	}

	public static void main(String[] args) {
	
          O1_dargument b=new O1_dargument();
          
          b.java(1245125,125655566);
          b.java("vijja@bbbvvbb.com", 1233555);
	}

}
