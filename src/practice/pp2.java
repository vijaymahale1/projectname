package practice;

abstract class Hello{
	
	abstract void s1();
}


class Hey extends Hello {
	
	
	public void s1() {
		
		System.out.println("hello sanket");
	}
	
}


public class pp2 extends Hello {
	
	
	public void s1() {
		
		System.out.println("hello vijay");
	}

	public static void main(String[] args) {
		
		
		Hello a1= new Hey ();
		
		pp2 a2=new pp2();
		
		a2.s1();
		
		a1.s1();
		
  
     
     
		
	}

}
