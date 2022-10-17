package practice;

abstract class kaustubh{
	
	
	abstract void m1();
	
	
	
}


class  prakash extends kaustubh {
	
	
	public void m1() {
		
		System.out.println("so nice person");
	
	}
}

 class ram extends  kaustubh {
	
	
	public  void m1() {
		
		System.out.println("hiii ");
	}
	
	


	public static void main(String[] args) {
		
		
		prakash s1=new prakash() ;
		
		s1.m1();
		
		
		ram s2=new ram ();
		s2.m1();
		
	
	}
	

}

