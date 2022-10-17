package practice;

import java.util.HashMap;
import java.util.Map;

public class hasmp {

	public static void main(String[] args) {
		
		
		
		//HashMap map=new HashMap();
		
		Map map=new HashMap();
		
		map.put("id", 1243);
		
		//map.put("Roll number", 101);
		
		
		map.put("password","vijay@4554");
		
		
		System.out.println(map.get("id"));
		
		System.out.println(map.get("password"));
		
	
		
		System.out.println(map.containsKey("id"));
		
		System.out.println(map.containsKey("Roll number"));

	}

}
