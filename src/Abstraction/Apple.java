package Abstraction;

abstract class fruit {
	
	
	abstract void test();
		
		
		}
  

public class Apple extends fruit{
	
	void test() {
		
		System.out.println("sweet test");
	}
	
	class orange extends Apple{
		
		void test() {
			
			System.out.println("colour orange");
		}
	}

	public static void main(String[] args) {
		
		
     Apple a=new Apple();
     a.test();
     
     
  
     
		
		
		
	
	

	}

}
