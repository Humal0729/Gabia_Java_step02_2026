package chapter18.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMain01 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("je", "emily", "kevin", "brian", "a");
		
		names.stream().filter(name -> name.length() >= 3).map(String::toUpperCase).sorted()
		.forEach(System.out::println);

	}

}
