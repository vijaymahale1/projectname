package a14_string;

public class reverse_used {

	public static void main(String[] args) {
		
	   String a="MAHARASHTRA";
	   
	   String reversed="";
	   
	   for(int b=a.length()-1;b>=0;b--) {
		   
		   
		   reversed=reversed+a.charAt(b);
	   }
	   
	  
      System.out.println(reversed);
	}

}
