package Inheritance;


class Animal{
	
	void Run() {
		
		System.out.println("i can run");
	}
}


public class dog extends Animal {

	public static void main(String[] args) {
		

		
		dog a=new dog();
		
		a.Run();
		
		
	}

}
