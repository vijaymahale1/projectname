package Collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// Array list 
		
		// 1.Allow duplicate value
		
		// 2.we can handle by index

		List list=new ArrayList();
		
		//( interface can't CREAT Object the Given REFERNCE(here List)
		// list import java.until.List
		
		list.add(10);
		
		list.add(20);
		
		list.add(30);
		
		list.add(20);
		
		list.add("TOM");
		
		System.out.println(list);//[10, 20, 30, 20, TOM] 
		
		list.remove(3);
		
		System.out.println(list);// Then after remove print [10, 20, 30, TOM]
		
		System.out.println(list.get(3)); // 'TOM'
		
	

		
		

	}

}
