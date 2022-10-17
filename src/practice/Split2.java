package practice;

public class Split2 {

	public static void main(String[] args) {
	
		
		String a="hey#hi#vijay#";
		
		String []b=a.split("#");
		
		
		String b1=b[0];
		String b2=b[1];
		
		String b3=b[2];
		
	//	System.out.println(b3);
		
		
		String s=b1+" "+b2+" "+b3;
		
		System.out.println(s);
	}

}
