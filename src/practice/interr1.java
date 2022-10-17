package practice;

interface inter1{
	
	public abstract void  m1();
	
	void m2();
}


interface inter2{
	
	void m7();
}

public class interr1 implements inter1,inter2  {
	
	
	public void m1 (){
		
		
		System.out.println("hiii");
		
		
	}
	
	public void m2() {
		
		System.out.println("vijay");
		
	}
	
	public void m7() {
		
		System.out.println("byyy");
	}
	
	

	public static void main(String[] args) {
		
		
		interr1 b=new interr1();
		
		b.m1();
		
		b.m2();
        
		b.m7();
	}

}
