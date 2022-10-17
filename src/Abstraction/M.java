package Abstraction;

abstract class F{
	
	abstract void T1();   // hide the implementation
                          // here no any body provide
}


class A1 extends F{
	
	
	public void T1() {   // override the T1
		
		System.out.println("coloure is red");
	}
	
}

public class M extends F { // in this term also  override
	
	 public void T1() {
		 
		 System.out.println("coloure is yellow");
	 }

	public static void main(String[] args) {
		
      M d=new M();
      A1 s=new A1();
      
      s.T1();
      
      d.T1();
	}

}
