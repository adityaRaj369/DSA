package HashMap;
import java.util.HashMap;
import java.util.Set;
public class InBuiltMapUse {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("abc", 1);
		map.put("def", 2);
		// for checking presence of the key
        if(map.containsKey("abc")) {
        	System.out.println("Map has abc");
        }
        if(map.containsKey("abc1")){
        	System.out.println("Map has abc1");
        }
        //for getting the value  we use get keyword and enter the key to get the value
        int v=map.get("abc");
        int v1=0;
        System.out.println(v);if(map.containsKey("abc1")) {
        	v1=map.get("abc1");   // to skip from null point exception we used if statement
        }
        System.out.println(v1);
        //remove
        map.remove("def");
        if(map.containsKey("def")) {
        	System.out.println("Map has def");
        }
        
        map.put("ghi",44);
        //updating the value of the key
        map.put("abc",22);
        System.out.println(map.size());
        int v2=map.get("abc");
        System.out.println(v2);
        //iterating a hashMap
        Set<String> keys=map.keySet();
        for(String s:keys) {
        	System.out.println(s);
        }
        //we also have map.containsValue
        
        
        
	}
}
