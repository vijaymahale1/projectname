package Collection;

import java.util.HashMap;
import java.util.Map;

public class mapp {

	public static void main(String[] args) {
		
		// Hashmap: here we store the value in key value pair
		
		
		Map map=new HashMap();
		
		
		map.put("ID", 505);
		map.put("adress", "at post jauke(vani), taluka Dindori, district Nshik");
		
		map.put("pin code", 4222056);
		
		map.put("Email","vijaylmahale@gamail.com");
		map.put("username",1245156);
		map.put("password", 4545865);
		
		
	System.out.println(map.get("ID"));
	
	System.out.println(map.get("adress"));
	
	System.out.println(map.get("pin code"));
	
	System.out.println(map.get("Email"));
	
	System.out.println(map.get("username"));
		
	System.out.println(map.get("password"));
		

	}

}
