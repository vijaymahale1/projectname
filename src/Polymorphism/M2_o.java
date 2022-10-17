package Polymorphism;

public class M2_o {
// method one but form different that is called as POLYMORPHism
	// no of argument give as per requirement
	
	void s1(int a,int b) {
		
		System.out.println("abc");
	}
	
	
	void s2(int a){
		
		System.out.println("xyz");
		
	}
	public static void main(String[] args) { 
		
        
	M2_o c=new M2_o();
	
	c.s1(10, 20);;     // here s1 and s2 overloading 
	}

}
