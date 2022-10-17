package Keywords;

//Super keyword refer to parent class instance variable

class c1{
	
	int a;
	int b=a+20;
	
}
 
public class b1 extends c1 {

	
	public void m1(int a) {
		
		System.out.println(a);
		super.a=a;
		
	}
	public static void main(String[] args) {
	
		
			b1 d1=new b1();
			
			System.out.println(d1.b);
			d1.m1(10);
			
		
			
		
		

		
		
			
		
			
		
			
	
			
			
			
	
		
	}
}
