package a1_constructor;

public class Sanket {
	
	String name;
	int salary;
	
	Sanket(String name,int salary){
		
		this.name=name;
		this.salary=salary;
		
		System.out.println(this.name+" & "+this.salary);
	}
	
  public static void main(String[] args) {
		
	  System.out.println("name "+" | "+" salary");
	  System.out.println("----------------------");
	  
	  Sanket d1=new Sanket("BAJAJ AUTO",100000);
	  
	  Sanket d2=new Sanket("MAHINDRA",200000);
	  
	  

	}

}
