package Keywords;


//Used to invoke parent class constructor(super key word)
 
class c3{
	
	
	c3(){
		
		System.out.println(" i am c3");
		
	}
}

public class b3 extends c3 {
	
	b3(){
		
		System.out.println("i am b3");
	}

	public static void main(String[] args) {
		
		
		b3 s=new b3();
		
		

	}

}
