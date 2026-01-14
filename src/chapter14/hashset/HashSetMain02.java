package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain02 {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		
		hashSet.add("Apple");
		
		System.out.println(hashSet);
		if(hashSet.contains("Banana")) System.out.println("바나나 있음");
		
		hashSet.remove("Orange");
		System.out.println(hashSet);

	}

}
