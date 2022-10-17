package Keywords;

//Final method: we cannot override the method

class s1{
	
	final public void m1() {
		
		System.out.println("yes");
		
	}
}



public class f2 extends s1 {
   
	
	public void m2() {  // here add same method  cannot override after check add 
		
		               // m1 place on m2
		
		System.out.println("NO");
	}
	
	public static void main(String[] args) {
		
		 f2 k=new f2();
		 
		 k.m1();
		

	}

}
