package Array;

public class v1 {

	public static void main(String[] args) {
		
		
		int[][]a=new int[3][4];
		
		//initialaztaion 
		
		a[0][0]=20;
		a[1][2]=30;
		a[2][3]=40;
		
		
		int b[][]= {{10,20,30,40},{40,50,60,40},{70,80,90,40}};
		
		System.out.println(b[0][2]);//30
		
		System.out.println(b[2][1]);//80
		
		System.out.println(b[0].length);
		
		

	}

}
