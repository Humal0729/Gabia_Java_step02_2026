package chapter14.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain01 {

	public static void main(String[] args) {
		Set<String> treeset = new TreeSet<String>();
		
		treeset.add("Banana");
		treeset.add("Orange");
		treeset.add("Apple");
		
		treeset.add("Apple");
		
		System.out.println(treeset);
		if(treeset.contains("Banana")) System.out.println("바나나 있음");

	}

}
