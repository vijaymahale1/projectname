package practice;

public class reverS {

	public static void main(String[] args) {
		
		
		String a="vijay";
		
		String rever="";
		
		for(int b=a.length()-1;b>=0; b--) {
			
			
			rever=rever+a.charAt(b);
	
		}
		
		System.out.println(rever);

	}

}
