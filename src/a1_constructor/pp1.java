package a1_constructor;

public class pp1 {
	
	String name;
	int id;
	int pincode;
	
	pp1(String name,int id,int pincode){
		
		this.name=name;
		this.id=id;
		this.pincode=pincode;
		
		System.out.println(this.name+" & "+this.id+" & "+this.pincode);
	}

	public static void main(String[] args) {
		
		pp1 s1=new pp1("snaket",202212,1232);
		pp1 s2=new pp1("vijay",20225552,4565);

	}

}
