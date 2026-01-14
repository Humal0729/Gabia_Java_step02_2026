package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain03 {

	public static void main(String[] args) {
		TreeMap<Integer, Employee> empMap = new TreeMap<Integer, Employee>();
		
		empMap.put(3, new Employee("Henrie", 20));
		empMap.put(1, new Employee("Chris", 23));
		empMap.put(2, new Employee("Vahmie", 22));
		empMap.put(4, new Employee("Odnin", 25));
		
		for(Map.Entry<Integer, Employee> entry: empMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		int no =1;
		System.out.println();
		
		System.out.println(empMap.get(1));

	}

}
