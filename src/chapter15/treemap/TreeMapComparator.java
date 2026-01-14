package chapter15.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> scoreMap = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
		
		scoreMap.put(1003, 85);
		scoreMap.put(1001, 80);
		scoreMap.put(1002, 95);
		
		System.out.println(scoreMap);
		
		System.out.println("가장 큰 번호: " + scoreMap.firstKey());
		System.out.println("가장 작은 번호: " + scoreMap.lastKey());

	}

}
