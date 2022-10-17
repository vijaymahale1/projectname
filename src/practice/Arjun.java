package practice;

public class Arjun {

	public static void main(String[] args) {
		
		String s="abad";
		String org=s;
		
		char[] arr = s.toCharArray();
		
	 int si=0;
	 int ei = arr.length;
	 
	 String rev ="";
	 
	 for (int i = ei-1; i>=0 ; i--) {
	      rev=rev+arr[i];	
	}
	 
	 System.out.println(rev);
	 
	 if(org.equals(rev)) {
		 
		 System.out.println("palandrom");
	 }else {
		 
		 System.out.println("not palandrom");
	 }

	}

}
