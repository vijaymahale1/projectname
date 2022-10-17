package practice;

public class p2 {

	public static void main(String[] args) {
		
		String v1=new String("Hello");
		
		String v2=new String("Hello");
		
		
		System.out.println(v1==v2);//false reference comparison method
		
		System.out.println(v1.equals(v2));//true content comparison method
		
		
		
		StringBuffer s1=new StringBuffer("how are u");
		StringBuffer s2=new StringBuffer("how are u");
		
		System.out.println(s1==s2);//false
		
		System.out.println(s1.equals(s2));//false
		
		
		
		
		
		

	}

}
