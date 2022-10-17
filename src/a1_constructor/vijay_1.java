package a1_constructor;

public class vijay_1 {

	
	String name;
	int price;

	vijay_1(String name,int price){

	this.name=name;
	this.price=price;
	
	System.out.println(this.name+"  &  "+this.price);
	
	}

	
	public static void main(String[] args) {
		
		System.out.println("name "+"content  "+"price");
		
		System.out.println("------------------------");
		
		vijay_1 a1=new vijay_1("sonimobile",40000);


		vijay_1 a2=new vijay_1("samsungmobile",50000);


		vijay_1 a3=new vijay_1("Redmimobile",30000);

	}

}
