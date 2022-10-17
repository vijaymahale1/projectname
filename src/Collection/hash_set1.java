package Collection;

import java.util.HashSet;
import java.util.Set;

public class hash_set1 {

	public static void main(String[] args) {
		
		Set set=new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(20);//dublicate value can't allow
		
		set.remove(40);//here used particular value remove not used index
		
		System.out.println(set.contains(20));
		
		System.out.println(set.size());
		
		
		System.out.println(set);
		
		System.out.println(set.isEmpty());
		
		set.clear();
		
		System.out.println(set.isEmpty());
		
		
		
		

	}

}
