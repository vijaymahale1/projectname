package practice;

public class ss4 {

	public static void main(String[] args) {
		
		
		String s1="vijay";
		
		String reversed=" ";
		
		
		for(int a=s1.length()-1;a>=0;a--) {
			
			reversed=reversed+s1.charAt(a);
			
		}
		
		System.out.println(reversed);

	}

}
