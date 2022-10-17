
public class Welcome {
	int a=20;     // instance variable or non static variable
	static int b=50;  // static variable
	
	public void vijay() {
		System.out.println("wlecome to vijay");
	}
	public static void kaustubh() {
		System.out.println("welcome to kaustubh");
	}
	 public void addition(int v,int m ) {
		 int p=v+m;
		 System.out.println(p);
			 
		 }
	 public void substraction(int i,int k) {
		 int l=i-k;
		 System.out.println(l);
	}
		 public void division(int d,int r) {
			 int u=800/45;
			 System.out.println(u);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);
		
		Welcome x=new Welcome();/// new object
		System.out.println(x.a);
		x.vijay();
		Welcome.kaustubh();
		x.addition(800, 1200);
		x.substraction(600, 300);
		x.division(800,45);

	}

}
