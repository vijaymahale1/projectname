package Inheritance;

public class Parot extends bird{
	
	 public void speek() {
		 
		 System.out.println("Nature");
	 }
	 

	public static void main(String[] args) {
		
		
		Parot s=new Parot();
		
		s.fly();
		s.speek();
	

	}

}
