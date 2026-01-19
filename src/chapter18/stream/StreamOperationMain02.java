package chapter18.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationMain02 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sophia", "Emma", "Olivia", "Isabella", "Mia");
		
		Stream<String> str = list.stream();
		
		str.sorted().forEach(System.out::println);
		System.out.println();
		
		// 한번 쓴 stream은 재사용 불가
		//str.filter(s -> s.contains("m")).forEach(System.out::println);
		
		list.stream().filter(s -> s.toUpperCase().contains("M")).forEach(System.out::println);
		
		System.out.println();
		
		list.stream().filter(s -> s.length() >= 5).forEach(System.out::println);
		
		// --------------------------------------------------------------
		int arr[] = { 39, 58, 88, 56, 77, 99, 23 };
		
		Arrays.stream(arr).sorted().forEach(System.out::println);
		System.out.println();
		Arrays.stream(arr).filter(ast -> ast%2 == 0).forEach(System.out::println);
		System.out.println();
		Arrays.stream(arr).filter(ast -> ast%2 != 0 && ast%3 !=0).forEach(System.out::println);

	}

}
