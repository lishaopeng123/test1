package Test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class test1 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("李四", 20);
		map.put("王五", 23);
		map.put("张三",30);
		
		Set<String> Set = map.keySet();
		for (String key : Set) {
			System.out.println(key+""+map.get(key));
		}
	}
	
	

}
