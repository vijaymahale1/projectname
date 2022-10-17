package a1_constructor;

public class aa1 {
	
	String Playername;
	
	String Sport;
	
	int Runs;
	
	aa1(String Playername,String Sport,int Runs){
		
		this.Playername=Playername;
		this.Sport=Sport;
		this.Runs=Runs;
		
		System.out.println(this.Playername+" | "+this.Sport+" | "+this.Runs);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Playername "+"   | "+"Sport  "+"   | "+" Runs");
		
		aa1 s1=new aa1("Sachin Tendulkar","Cricket",40000);
		
		aa1 s2=new aa1("Virendr Sehavag","Cricket",300000);
		aa1 s3=new aa1("MS Dhoni","Cricket",350000);
		
		aa1 s4=new aa1("Saurav Gangoli","Cricket",40000);
		

	}

}
