package a1_constructor;

public class v1 {
	
	String name;
	
     int marks;
     
     
     v1(String name,int marks){
    	 
    	 this.name=name;
    	 this.marks=marks;
    	 
    	 
    	 System.out.println(this.name+" | "+ this.marks);
     }
   
   
  public static void main(String[] args) {
	
	  
	  System.out.println("name "+" | "+"marks");
	  
	  System.out.println("---------------");
	  
	  v1 a1=new v1("vijay",203);
	  
	  v1 a2=new v1("vijay",204);
	 
	  v1 a3=new v1("vijay",205);

	}

}
