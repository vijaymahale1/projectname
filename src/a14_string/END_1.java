package a14_string;

public class END_1 {

	public static void main(String[] args) {
		// End with to find particular file or String with end with particular char 
		
		//use
		
		
		String a="Sauth Africa";
		
		System.out.println(a.endsWith("ica"));// true output
        System.out.println(a.endsWith("icaa"));// False output
        
        if(a.endsWith("rica")) {
        	
        	System.out.println("Sauth Africa");
        }
        else {
        	
        	System.out.println("India");
        }
        
     
      class Start_1 extends END_1{
    	 
     }
        
        //start with 
         
        String c="Maharastra";
        
        System.out.println(c.startsWith("Maha"));// true
        System.out.println(c.startsWith("har"));// false
        
        if(c.startsWith("Mahaa")) {
        	
        	System.out.println("yes");
        }
        
        else {
        	
        	System.out.println("No");
        }
        
     
        
	}
    
	
	
	
}
