package Array;

public class Two_D {

	public static void main(String[] args) {
		
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=0;j<=a.length-1;j++) {
				
				System.out.println(a[i][j]);
			}
		}

	}

}
