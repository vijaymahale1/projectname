package Inheritance;

class d1 {
	
	
	void c1() {
		
		System.out.println("i am enjoy with java");
		
		
	}
}

class v2 extends d1 {
    
	
	void c2() {
		
		System.out.println("i can do it");
	}
	}


public class aa1 extends v2 {

	public static void main(String[] args) {
	
     aa1 s=new aa1();
      s.c1();
      s.c2();
     
     
	}

}
