package practice;

import java.util.HashSet;
import java.util.Set;

public class ok {

	public static void main(String[] args) {
		
		
		//HashSet set=new HashSet();
		
		Set set=new HashSet();
		
		set.add(10);
		set.add(20);
		
		set.add(30);
		set.add(10);
		
		set.add(40);
		
		System.out.println(set);
		
		int []b= {10,20,30,40};
		
		
		for(int c=0;c<=b.length-1;c++)
		
			System.out.println(b[c]);
		

		System.out.println(set);

		
		int []b1= {10,20,30,40};
		
		
		for(int c=0;c<=b.length-1;c++)
		System.out.println(b1[c]);
		
		set.clear();
		
		System.out.println(set.isEmpty());

	}
	
}
