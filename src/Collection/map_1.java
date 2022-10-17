package Collection;

import java.util.HashMap;
import java.util.Map;

public class map_1 {

	public static void main(String[] args) {
     
		
		
		Map map=new HashMap();
		
		map.put("id", 143);
		map.put("Roll number", 125456);
		
		map.put("password", 125556);
		
		map.put("pin", 4565);
		
		map.put("mobile no", 155666665);
		
		System.out.println(map.get("id"));
		System.out.println(map.get("pin"));

	}

}
