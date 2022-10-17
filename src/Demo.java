
public class Demo {
    
	int a=20;  //  instance variables  (non static)
	static int b=30;  //  static variables 
	
	public void display () { //  non static
		System.out.println("i am display method");
		
	}
	public static void show() {
		System.out.println("i am static show method");
	}
	
	public void addition (int p,int q) {
		int z=p+q;   // 60+70
		System.out.println(z);  // 130
	}
	public void addition () {
		int s=20;
		int t=30;
		System.out.println(s+t); // 50
	    
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo.b);
		Demo d=new Demo();  // object creation
		System.out.println(d.a);
		d.display();
		Demo.show();
		d.addition(60,70);
		d.addition (); // 50

	}

}
