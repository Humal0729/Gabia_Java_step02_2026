package chapter14.treeset;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableStudentMain03 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Alice", 85));
		students.add(new Student("Bob", 75));
		students.add(new Student("Chalie", 95));
		
		
		for(Student st : students) System.out.println(st);

	}
}
