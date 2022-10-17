package practice;

public class reversd {

	public static void main(String[] args) {
		
		String a="vijay mahale";
		
		String reversed="";
		
		for(int b=a.length()-1;b>=0;b--) {
			
			reversed=reversed+a.charAt(b);
		}
              System.out.println(reversed);
              
              
             
	}

}
