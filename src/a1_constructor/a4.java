package a1_constructor;

public class a4 {
    
	String name;
	int marks;
	
	a4(String name,int marks){
		
		this.name=name;
		this.marks=marks;
		
	System.out.println(this.name+" & "+this.marks);
	}
	
	public static void main(String[] args) {
		
		
		a4 a=new a4("vijay",60);
		a4 a1=new a4("kaustubh",70);
		a4 a2=new a4("priyanka",80);
		a4 a3=new a4("krishana",90);
		a4 a4=new a4("prakash",50);
		

	}

}
