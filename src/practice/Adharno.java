package practice;

public class Adharno {
	
	private int Adharnumber;
	
	public void setAdharnumber(int Adharnumber) {
		
		this.Adharnumber=Adharnumber;
	}
	
	public int getAdharnumber() {
		
		return Adharnumber;
	}

	public static void main(String[] args) {
	 
		
		Adharno a=new Adharno();
		
		a.setAdharnumber(1245789124);
		
		System.out.println(a.getAdharnumber());

	}

}
