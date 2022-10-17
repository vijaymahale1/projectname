package Collection;

import java.util.HashSet;
import java.util.Set;

public class hassset {

	public static void main(String[] args) {
		// HashSet
		// 1.not allowed duplicate value
		
		//  2. we can not handle by index( means can't serial voice handle)
		
		
		Set set=new HashSet();
		
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		
		System.out.println(set);//[20, 10, 30]
		
		set.remove(20);
		
		System.out.println(set);//[10, 30]
		
		System.out.println(set.contains(30)); // true ,value or not
		
		
		System.out.println(set.isEmpty());// false because value is present in array
		
		
		
		

	
	}
}
