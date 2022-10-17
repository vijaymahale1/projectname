package Inheritance_multilevel;
// multilevel inheritance child class acquired all property and behavior from
 //parents class 
class Rohit{    //Good
	
	void Good () {
		
		System.out.println("Rohit is Good person");
	}
}

 class Krishana extends Rohit {   // Good ,cleaver
	 
	 void clever() {
		 
		 System.out.println("krishana is clever");
	 }
 }
 
class kaustubh extends Krishana {    // Good ,clever,handsome 
	
	void handsome() {
		
		System.out.println("handsome boy");
	}
}


public class a1 extends kaustubh { // Good,clever,handsome,bad
	
	void bad() {
		  System.out.println("bad person");
	}

	public static void main(String[] args) {
	
        a1 d=new a1();
        
        d.Good();
        d.clever();
        d.handsome();
        d.bad();
        
	}

}
