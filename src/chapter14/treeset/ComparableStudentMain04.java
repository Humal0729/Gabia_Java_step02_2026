package chapter14.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableStudentMain04{

	public static void main(String[] args) {
		List<Employee> students = new ArrayList<Employee>();
		
		students.add(new Employee("Bob", 21));
		students.add(new Employee("Chalie", 19));
		students.add(new Employee("Alice", 20));
		
		Collections.sort(students, new NameComparator());
		for(Employee st : students) System.out.println(st);
		
		System.out.println();
		
		Collections.sort(students, new AgeComparator());
		for(Employee st : students) System.out.println(st);

	}

}
