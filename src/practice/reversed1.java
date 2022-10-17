package practice;

public class reversed1 {

	public static void main(String[] args) {
		
		
		String a="jai Hanuman";
		
		
		String b="";
		
		
		for(int c=a.length()-1;c>=0;c--) {
			
			b=b+a.charAt(c);
		}
		
		System.out.println(b);

	}

}
