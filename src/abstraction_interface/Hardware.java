package abstraction_interface;
interface intersoftware{
	
	
  public abstract void ss1();
     
   int a=10;
}

interface interS1{
	
	  public abstract void ss2();
	
}

interface interS2{
	
	  public abstract void ss3();
}

public class Hardware implements intersoftware, interS1,interS2{
	  
	public void ss1() {
		
		System.out.println("hiii");
		
		
		}
  
	public void ss2() {
		System.out.println("hello");
	}
	public void ss3() {
		
		System.out.println("nice");
	}
	

	public static void main(String[] args) {
		
		Hardware k1=new Hardware();
		
		k1.ss1();
		k1.ss2();
		k1.ss3();
		
		System.out.println(a);
		
     
	}

}
