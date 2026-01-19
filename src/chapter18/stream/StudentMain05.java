package chapter18.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain05 {

	public static void main(String[] args) {
		Student[] stuArr = { new Student(1, "홍길동", 85), new Student(2, "이범석", 77), new Student(3, "김홍석", 84),
				new Student(4, "최민호", 56), new Student(5, "김수정", 66), new Student(6, "최혜진", 79) };
		
		List<String> names = Stream.of(stuArr) // 스트림 변환
				.map(Student::getName) // 이름만 추출
				.collect(Collectors.toList()); // 최종리스트로 변환
		System.out.println(names);
		
		List<Integer> engScore = Stream.of(stuArr) // 스트림 변환
				.map(Student::getEng) // 점수만 추출
				.collect(Collectors.toList()); // 최종리스트로 변환
		System.out.println(engScore);
		
		List<String> seventyUp = Stream.of(stuArr) // 스트림 변환
				.filter(s -> s.getEng()>70)
				.map(Student::getName) // 이름만 추출
				.collect(Collectors.toList()); // 최종리스트로 변환
		System.out.println(seventyUp);

	}

}
