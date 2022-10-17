package a1_constructor;

public class dd1 {
	
	String Productname;
	int Price;
	
	dd1(String Productname,int Price){
		
		this.Productname=Productname;
		this.Price=Price;
		
		System.out.println(this.Productname+" @ "+this.Price);
	}

	public static void main(String[] args) {
		
		System.out.println("Productname  "+" @ "+" Price" );
		
		dd1 h1=new dd1("Slice",20);
		dd1 h2=new dd1("T-shirt",500);
		dd1 h3=new dd1("Mobile",20000);
		
		
		
		

	}

}
