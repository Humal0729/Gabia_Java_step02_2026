package chapter15.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDifference03 {

	public static void main(String[] args) {
		Map<String, String> hashmap = new HashMap<>();
		
		hashmap.put("apple", "red");
		hashmap.put("banana", "yellow");
		hashmap.put("grape", "purple");
		hashmap.put("orange", "orange");
		
		for(Map.Entry<String, String> entry: hashmap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
		Map<String, String> linkedhashmap = new LinkedHashMap();
		
		linkedhashmap.put("apple", "red");
		linkedhashmap.put("banana", "yellow");
		linkedhashmap.put("grape", "purple");
		linkedhashmap.put("orange", "orange");
		
		for(Map.Entry<String, String> entry: linkedhashmap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
