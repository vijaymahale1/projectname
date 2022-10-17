package practice;

public class z1 {

	public static void main(String[] args) {
		
		
		String z1="OMNAMSHIVAY";
		
		String reversed="";
		
		
		for(int x=z1.length()-1;x>=0;x--) {
			
			reversed=reversed+z1.charAt(x);
		}
     
		
		System.out.println(reversed);
	}

}
