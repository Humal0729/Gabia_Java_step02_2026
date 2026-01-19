package chapter18.stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationMain03 {

	public static void main(String[] args) {
		// Stream.of(): 객체를 스트림으로 변환
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("Ex2"),
				new File("Ex2.bak"), new File("Test.java"));
		
		stream.map(File::getName)
		.filter(f -> f.indexOf(".") > -1)
		.map(f -> f.substring(f.lastIndexOf(".")+1))
		.distinct()
		.forEach(System.out::println);
		
		
		// Arrays.asList(): 배열을 스트림으로 변환
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting",
				"Mapping", "Reduction", "Stream");
		
		Set<String> intermediaResults = new HashSet<String>();
		List<String> result = list.stream() //stream으로 형변환
				.filter(s -> s.startsWith("S")) // S로 시작하는 문자열
				.map(String::toUpperCase).distinct().sorted() // 대문자변환, 중복제거, 정렬
				.peek(s -> intermediaResults.add(s)) // 결과 저장
				.collect(Collectors.toList()); // 새 리스트 생성
		
		System.out.println();
		result.forEach((i) -> System.out.println(i + " "));
	}

}
