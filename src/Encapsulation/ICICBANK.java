package Encapsulation;

public class ICICBANK {
	
	private int vijay;

	public void setaccount(int ID) {
		
		this.vijay=ID;
	}
	
	public int getaccount() {
		
		return vijay;
	}
	public static void main(String[] args) {
	
     ICICBANK b=new ICICBANK();
     
     b.setaccount(15244);
     
     System.out.println(b.getaccount());
	}

}
