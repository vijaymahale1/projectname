package practice;

public class rs {

	public static void main(String[] args) {
		
		
		String d="MAHARASHTRA";
		String reversed="";

		for(int s=d.length()-1;s>=0;s--){

		reversed=reversed+d.charAt(s);
		}
		System.out.println(reversed);

	}

}
