package practice;

public class factorial1 {
	
	public static int facatorial(int num) {
		
		if(num==0) {
			
			return 1;
		}
		
		return num *facatorial (num-1);
	}

	public static void main(String[] args) {
	

		
		System.out.println(facatorial(4));
	}

}
