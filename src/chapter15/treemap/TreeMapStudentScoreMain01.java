package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentScoreMain01 {

	public static void main(String[] args) {
		TreeMap<String, Integer> studentScore = new TreeMap<String, Integer>();
		
		studentScore.put("David", 95);
		studentScore.put("Bob", 92);
		studentScore.put("Alice", 85);
		studentScore.put("Charlie", 78);
		
		for(Map.Entry<String, Integer> entry: studentScore.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		String name = "Bob";
		System.out.println();
		
		System.out.println(studentScore.get(name));

	}

}
