package chapter15.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain01 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김우진", 85);
		map.put("이수정", 90);
		map.put("박진영", 98);
		map.put("정하나", 75);
		System.out.println("총 Entery 수: " + map.size());
		
		System.out.println();
		System.out.println("이수정: " + map.get("이수정"));
		System.out.println();
		
		Set<String> key = map.keySet();
		Iterator<String> keyIt = key.iterator();
		
		while(keyIt.hasNext()) {
		String k = keyIt.next();
		Integer value=map.get(k);
		System.out.println(k + ": " + value);
		}
		
		map.clear();
		System.out.println("총 Entery 수: " + map.size());

	}
}
