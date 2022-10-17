package a14_string;

public class Spli1 {

	public static void main(String[] args) {
		// split
		
		String a="vijay@hey@how@are@you";
		
		String[] b=a.split("@");
		
		String b1=b[0];
		
		String b2=b[1];
		
		String b3=b[2];
		
		String b4=b[3];
		
		String b5=b[4];
		
		
	//	System.out.println(b3);
		
		String s=b1+" "+ b2+" "+b3+" "+b4+" "+b5 ;
		
   System.out.println(s);

	}

}
