package practice;

public class Letter {
	
	
	private String Vijay1123;
	
	public  void setpassword(String vijay1123) {
		
		this.Vijay1123=vijay1123;
		
		}
	
	public String getpassword() {
		
		return "vijay1123";
	}

	public static void main(String[] args) {
		
		Letter b=new Letter();
		
		b.setpassword("vijay1123");
		
		System.out.println(b.getpassword());

	}

}
