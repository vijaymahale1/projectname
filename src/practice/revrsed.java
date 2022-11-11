package practice;

public class revrsed {

	public static void main(String[] args) {
	
		
		String a="Arjun";
		
		String reversed="";
		
		for(int c=a.length()-1;c>=0;c--) {
			
			reversed=reversed+a.charAt(c);
		}
		 
		System.out.println(reversed);

	}

}
