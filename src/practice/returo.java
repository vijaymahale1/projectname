package practice;

public class returo {

	public static void main(String[] args) {
	
		
		String a="vijay";
		
		String reverse="";
		
		for(int b=a.length()-1;b>=0; b--) {
			
			reverse=reverse+a.charAt(b);
		}
		
		System.out.println(reverse);
		
		

	}

}
