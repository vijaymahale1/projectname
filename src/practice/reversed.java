package practice;

public class reversed {

	public static void main(String[] args) {
		
		
		String b="Google";
		
	    String reversed="";
	    
	    for(int c=b.length()-1;c>=0;c--) {
	    	
	    	reversed=reversed+b.charAt(c);
	    	
	    	
	    }
	    
	    System.out.println(reversed);

	}

}
